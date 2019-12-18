# music-playground

Start making music with Clojure with instant feedback.

## Quick start

- `git clone git@github.com:warang580/music-playground.git`
- `cd music-playground`
- `lein repl`
- `(in-ns 'music.core)`
- `(play! [:piano #{:c :e :g}])`

## Usage

- `play!` : Play a score (can be another file using `load-file`)
- `stop!` : Stop playing

- [Score examples](https://oakes.github.io/edna/cljs/edna.examples.html)
- [Available instruments](https://github.com/alda-lang/alda/blob/master/doc/list-of-instruments.md)

For the full version, check https://github.com/oakes/edna. *The current repository is only a stripped-down version of the work of [Zach Oakes](https://sekao.net/) so it's more accessible. All credits goes to him !*
