# Bitmap Transform
## The Challenge
For this assignment you will be building a bitmap (.bmp) transformer CLI. It will read a bitmap in from disk, run one or more color or raster transforms and then write it out to a new file.
[Code]() | [Tests]()


## User Guide
1. Clone this repo to your local computer and `cd` into this directory.
2. To test run `./gradlew test` in the command line to confirm the tests pass.
3. Type `./gradlew run --args 'input-file output-file transform'` in the command line. See Available Resources for more direction.

## Available Resources

Transforms: `invert`, `randomize`, `flipHorizontally`, `flipVertically`


File | Sample Command
--- | ----
MARBLES.bmp | `./gradlew run --args 'MARBLES.bmp MARBLES-after.bmp invert'`
smiley.bmp |`./gradlew run --args 'smiley.bmp smiley-after.bmp randomize'`
test.bmp | `./gradlew run --args 'test.bmp test-after.bmp flipHorizontally'`


