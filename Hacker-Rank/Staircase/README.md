https://www.baeldung.com/java-printstream-printf#overview

### format print

`System.out.printf(format, arguments);`

`System.out.printf(locale,format, arguments);`

`System.out.printf("Hello s%!%n", "World" )`

#### format rules

`%[flags][width][.precision]conversion-character`
`%[-][10]s%`

##### Conversion Characters

- s formats strings
- d formats decimal integers.
- f formats floating-point numbers.
- t formats data/time values.

### optional modifiers

#### flags

`'-' left justify. If there is no '-' flag, right justify. `
`System.out.printf("%10s","Hello" );`

##### width

`number`

### Line serparator `%n`

### boolean formatting `%b`

`System.out.printf("%b%n", null);`
`System.out.printf("%B%n", true);`

### string formatting `%s %S`

`System.out.printf("s%", "hello");`

- `%15s` - right justify mininum 15 char
  `System.out.printf("15%s","hello");`
- `%-15s` - left justify minimum 15 char
- `%2.2s` - `%x.ys`
  `x`- padding
  `y`- number of chars
  `System.out.printf("%2.2s", "Hi there!")`;

### char formatting `%c %C`

- `System.out.printf("%c%n", 's');`
- `System.out.printf("%C%n", 's');`

### number formatting `%d %f`

- Integer
  `System.out.printf("simple integer: %d%n", 10000L)`
  `System.out.printf(Locale.ITALY, "%,d %n", 10000);`

- Float and Double
  `System.out.printf("%5.2f%n, 3.1415)`
  `5` - is the width of the number
  `2` - is the length of the decimal part

### Data and time `%t`

- `Date date = new Date();`
  `System.out.printf("%tT%n", date);`
  `13:51:15`
  `tT%` - time

- `System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);`
- `hours 13: minutes 51: seconds 15`

- `Date date = new Date();`
  `System.out.printf("%1$tA, %1$tB %1$tY %n", date);`
  to get rid of multiple arguments, we can use the index reference of our input parameter, which is `1$` in our case
