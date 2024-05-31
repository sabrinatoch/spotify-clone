import {Component, effect, inject, OnInit} from '@angular/core';
import {FavoriteSongBtnComponent} from "../shared/favorite-song-btn/favorite-song-btn.component";
import {SmallSongCardComponent} from "../shared/small-song-card/small-song-card.component";
import {ReadSong} from "../service/model/song.model";
import {SongService} from "../service/song.service";
import {SongContentService} from "../service/song-content.service";

@Component({
  selector: 'app-favorites',
  standalone: true,
  imports: [FavoriteSongBtnComponent, SmallSongCardComponent],
  templateUrl: './favorites.component.html',
  styleUrl: './favorites.component.scss'
})
export class FavoritesComponent implements OnInit {

  favoriteSongs: Array<ReadSong> = [];

  songService = inject(SongService);
  songContentService = inject(SongContentService);

  constructor() {
    effect(() => {
      let addOrRemoveSig = this.songService.addOrRemoveFavoriteSongSig();
      if (addOrRemoveSig.status === "OK") {
        this.songService.fetchFavorites();
      }
    });
    effect(() => {
      let favoriteSongState = this.songService.fetchFavoriteSongsSig()
      if (favoriteSongState.status === "OK") {
        favoriteSongState.value?.forEach(song => song.favorite = true);
        this.favoriteSongs = favoriteSongState.value!;
      }
    });
  }

  ngOnInit(): void {
    this.songService.fetchFavorites();
  }

  onPlay(firstSong: ReadSong) {
    this.songContentService.createNewQueue(firstSong, this.favoriteSongs);
  }

}
