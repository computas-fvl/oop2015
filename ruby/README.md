Mutant-Example
==============

Assumption: You cloned the repository and changed path to `./ruby`.

Setup:

1) Make sure `ruby` is in your path and >= `1.9.3`.

If you can reproduce this you are fine (version might differ, but should be >= 1.9.3)

```
$ ruby --version
ruby 2.2.0p0 (2014-12-25 revision 49005) [x86_64-linux]
```

2) Make sure you have `bundler` installed


If you can reproduce this you are fine (version might differ, anything >= 1.6 should be fine)

```
bundler --version
Bundler version 1.7.12
````

If `bundler` is NOT installed and your ruby setup is correct you should be able to install it via `gem install bundler`

3) Install the bundle

`bundle install`

If it looks like this you are fine:

```
bundle install
Using ice_nine 0.11.1
Using abstract_type 0.0.7
Using thread_safe 0.3.4
Using equalizer 0.0.9
Using ast 2.0.0
Using diff-lcs 1.2.5
Using memoizable 0.4.2
Using procto 0.0.2
Using adamantium 0.2.0
Using rspec-support 3.1.2
Using bundler 1.7.12
Using parallel 1.3.3
Using parser 2.2.0.2
Using concord 0.1.5
Using anima 0.2.0
Using unparser 0.2.2
Using morpher 0.2.3
Using rspec-core 3.1.7
Using rspec-expectations 3.1.2
Using mutant 0.7.5 from git@github.com:mbj/mutant.git (at master)
Using mutant-rspec 0.7.5 from git@github.com:mbj/mutant.git (at master)
Your bundle is complete!
Use `bundle show [gemname]` to see where a bundled gem is installed.
```

4) Run mutant ;)

`bundle exec mutant -I lib -r example --use rspec -- 'Example*'`

5) Open `spec/unit/example_spec.rb` to add tests.

6) Repeat 4) and 5) till all mutations are dead.
