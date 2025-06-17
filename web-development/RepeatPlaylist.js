class Song {
    name;
    nextSong;

    constructor(name) {
        this.name = name;
    }

    /**
     * @return {boolean} true if the playlist is repeating, false if not.
     */
    isInRepeatingPlaylist() {
        let playedSongs = new Set();
        let current = this;

        // while (current.nextSong) {
        //     playedSongs.add(current);
        //     current = current.nextSong;
        //     if (playedSongs.has(current.nextSong.name)) return true;
        //     if (current.nextSong === undefined) return false;
        // }

        while (current) {
            if (playedSongs.has(current)) return true;
            playedSongs.add(current);
            current = current.nextSong;
        }
        return false;
    }
}

let first = new Song("Hello");
let second = new Song("Eye of the tiger");

first.nextSong = second;
second.nextSong = first;

console.log(first.isInRepeatingPlaylist());