# cordova-plugin-sendkeystrokes
Plugin to fire Keyboard/Buttons events from javascript 


### Installation:
```cordova plugin add https://github.com/keilyn3d/cordova-plugin-sendkeystrokes```

### Usage:
sendKeystroke(eventType, KeyCode)

#### example:
```window.sendKeystroke(0, 29); // send keydown event with key A```

#### eventType: 0 = KeyDown, 1 = KeyUp

#### Common KeyCodes:

| Characters    | keyCodes      |
| ------------- |:-------------:|
| A - Z         | 29 - 54       |
| 0 - 9      | 7 - 16      |
| arrow keys | 19 - 22|
| back | 4      |
| menu | 82 |
| space | 62 |
| shift | 59 |
| enter | 66 |
| backspace | 67 |


___
### All keyCodes:
___
  | Key    | Code      || Key    | Code      || Key    | Code      |
  | ------------- |-------------|--| ------------- |-------------|--| ------------- |-------------|
| SOFT_LEFT |  1 | | BUTTON_A |  96 | | BUTTON_4 |  191 | 
| SOFT_RIGHT |  2 | | BUTTON_B |  97 | | BUTTON_5 |  192 |
| HOME |  3 |  | BUTTON_C |  98 | | BUTTON_6 |  193 |
| BACK |  4 | | BUTTON_X |  99 |  | BUTTON_7 |  194 |
| CALL |  5 | | BUTTON_Y |  100 | | BUTTON_8 |  195 | 
| ENDCALL |  6 | | BUTTON_Z |  101 | | BUTTON_9 |  196 |
| 0 |  7 |  | BUTTON_L1 |  102 | | BUTTON_10 |  197 |
| 1 |  8 | | BUTTON_R1 |  103 |  | BUTTON_11 |  198 |
| 2 |  9 | | BUTTON_L2 |  104 | | BUTTON_12 |  199 | 
| 3 |  10 | | BUTTON_R2 |  105 | | BUTTON_13 |  200 |
| 4 |  11 |  | BUTTON_THUMBL |  106 | | BUTTON_14 |  201 |
| 5 |  12 | | BUTTON_THUMBR |  107 |  | BUTTON_15 |  202 |
| 6 |  13 | | BUTTON_START |  108 | | BUTTON_16 |  203 | 
| 7 |  14 | | BUTTON_SELECT |  109 | | LANGUAGE_SWITCH |  204 |
| 8 |  15 |  | BUTTON_MODE |  110 | | MANNER_MODE |  205 |
| 9 |  16 | | ESCAPE |  111 |  | 3D_MODE |  206 |
| STAR |  17 | | FORWARD_DEL |  112 | | CONTACTS |  207 |
| POUND |  18 | | CTRL_LEFT |  113 | | CALENDAR |  208 |
| DPAD_UP |  19 |  | CTRL_RIGHT |  114 | | MUSIC |  209 |
| DPAD_DOWN |  20 | | CAPS_LOCK |  115 |  | CALCULATOR |  210 |
| DPAD_LEFT |  21 | | SCROLL_LOCK |  116 | | ZENKAKU_HANKAKU |  211 | 
| DPAD_RIGHT |  22 | | META_LEFT |  117 | | EISU |  212 |
| DPAD_CENTER |  23 |  | META_RIGHT |  118 | | MUHENKAN |  213 |
| VOLUME_UP |  24 | | FUNCTION |  119 |  | HENKAN |  214 |
| VOLUME_DOWN |  25 | | SYSRQ |  120 | | KATAKANA_HIRAGANA |  215 | 
| POWER |  26 | | BREAK |  121 | | YEN |  216 |
| CAMERA |  27 |  | MOVE_HOME |  122 | | RO |  217 |
| CLEAR |  28 | | MOVE_END |  123 |  | KANA |  218 |
| A |  29 | | INSERT |  124 | | ASSIST |  219 | 
| B |  30 | | FORWARD |  125 | | BRIGHTNESS_DOWN |  220 |
| C |  31 |  | MEDIA_PLAY |  126 | | BRIGHTNESS_UP |  221 |
| D |  32 | | MEDIA_PAUSE |  127 |  | MEDIA_AUDIO_TRACK |  222 |
| E |  33 | | MEDIA_CLOSE |  128 | | SLEEP |  223 | 
| F |  34 | | MEDIA_EJECT |  129 | | WAKEUP |  224 |
| G |  35 |  | MEDIA_RECORD |  130 | | PAIRING |  225 |
| H |  36 | | F1 |  131 |  | MEDIA_TOP_MENU |  226 |
| I |  37 | | F2 |  132 | | 11 |  227 | 
| J |  38 | | F3 |  133 | | 12 |  228 |
| K |  39 |  | F4 |  134 | | LAST_CHANNEL |  229 |
| L |  40 | | F5 |  135 |  | TV_DATA_SERVICE |  230 |
| M |  41 | | F6 |  136 | | VOICE_ASSIST |  231 | 
| N |  42 | | F7 |  137 | | TV_RADIO_SERVICE |  232 |
| O |  43 |  | F8 |  138 | | TV_TELETEXT |  233 |
| P |  44 | | F9 |  139 |  | TV_NUMBER_ENTRY |  234 |
| Q |  45 | | F10 |  140 | | TV_TERRESTRIAL_ANALOG |  235 | 
| R |  46 | | F11 |  141 | | TV_TERRESTRIAL_DIGITAL |  236 |
| S |  47 |  | F12 |  142 | | TV_SATELLITE |  237 |
| T |  48 | | NUM_LOCK |  143 |  | TV_SATELLITE_BS |  238 |
| U |  49 | | NUMPAD_0 |  144 | | TV_SATELLITE_CS |  239 | 
| V |  50 | | NUMPAD_1 |  145 | | TV_SATELLITE_SERVICE |  240 |
| W |  51 |  | NUMPAD_2 |  146 | | TV_NETWORK |  241 |
| X |  52 | | NUMPAD_3 |  147 |  | TV_ANTENNA_CABLE |  242 |
| Y |  53 | | NUMPAD_4 |  148 | | TV_INPUT_HDMI_1 |  243 | 
| Z |  54 | | NUMPAD_5 |  149 | | TV_INPUT_HDMI_2 |  244 |
| COMMA |  55 |  | NUMPAD_6 |  150 | | TV_INPUT_HDMI_3 |  245 |
| PERIOD |  56 | | NUMPAD_7 |  151 |  | TV_INPUT_HDMI_4 |  246 |
| ALT_LEFT |  57 | | NUMPAD_8 |  152 | | TV_INPUT_COMPOSITE_1 |  247 | 
| ALT_RIGHT |  58 | | NUMPAD_9 |  153 | | TV_INPUT_COMPOSITE_2 |  248 |
| SHIFT_LEFT |  59 |  | NUMPAD_DIVIDE |  154 | | TV_INPUT_COMPONENT_1 |  249 |
| SHIFT_RIGHT |  60 | | NUMPAD_MULTIPLY |  155 |  | TV_INPUT_COMPONENT_2 |  250 |
| TAB |  61 | | NUMPAD_SUBTRACT |  156 | | TV_INPUT_VGA_1 |  251 | 
| SPACE |  62 | | NUMPAD_ADD |  157 | | TV_AUDIO_DESCRIPTION |  252 |
| SYM |  63 |  | NUMPAD_DOT |  158 | | TV_AUDIO_DESCRIPTION_MIX_UP |  253 |
| EXPLORER |  64 | | NUMPAD_COMMA |  159 |  | TV_AUDIO_DESCRIPTION_MIX_DOWN |  254 |
| ENVELOPE |  65 | | NUMPAD_ENTER |  160 | | TV_ZOOM_MODE |  255 | 
| ENTER |  66 | | NUMPAD_EQUALS |  161 | | TV_CONTENTS_MENU |  256 |
| DEL |  67 |  | NUMPAD_LEFT_PAREN |  162 | | TV_MEDIA_CONTEXT_MENU |  257 |
| GRAVE |  68 | | NUMPAD_RIGHT_PAREN |  163 |  | TV_TIMER_PROGRAMMING |  258 |
| MINUS |  69 | | VOLUME_MUTE |  164 | | HELP |  259 | 
| EQUALS |  70 | | INFO |  165 | | NAVIGATE_PREVIOUS |  260 |
| LEFT_BRACKET |  71 |  | CHANNEL_UP |  166 | | NAVIGATE_NEXT |  261 |
| RIGHT_BRACKET |  72 | | CHANNEL_DOWN |  167 |  | NAVIGATE_IN |  262 |
| BACKSLASH |  73 | | ZOOM_IN |  168 | | NAVIGATE_OUT |  263 | 
| SEMICOLON |  74 | | ZOOM_OUT |  169 | | STEM_PRIMARY |  264 |
| APOSTROPHE |  75 |  | TV |  170 | | STEM_1 |  265 |
| SLASH |  76 | | WINDOW |  171 |  | STEM_2 |  266 |
| AT |  77 | | GUIDE |  172 | | STEM_3 |  267 | 
| NUM |  78 | | DVR |  173 | | DPAD_UP_LEFT |  268 |
| HEADSETHOOK |  79 |  | BOOKMARK |  174 | | DPAD_DOWN_LEFT |  269 |
| FOCUS |  80 | | CAPTIONS |  175 |  | DPAD_UP_RIGHT |  270 |
| PLUS |  81 | | SETTINGS |  176 | | DPAD_DOWN_RIGHT |  271 | 
| MENU |  82 | | TV_POWER |  177 | | MEDIA_SKIP_FORWARD |  272 |
| NOTIFICATION |  83 |  | TV_INPUT |  178 | | MEDIA_SKIP_BACKWARD |  273 |
| SEARCH |  84 | | STB_POWER |  179 |  | MEDIA_STEP_FORWARD |  274 |
| MEDIA_PLAY_PAUSE |  85 | | STB_INPUT |  180 | | MEDIA_STEP_BACKWARD |  275 | 
| MEDIA_STOP |  86 | | AVR_POWER |  181 | | SOFT_SLEEP |  276 |
| MEDIA_NEXT |  87 |  | AVR_INPUT |  182 | | CUT |  277 |
| MEDIA_PREVIOUS |  88 | | PROG_RED |  183 |  | COPY |  278 |
| MEDIA_REWIND |  89 | | PROG_GREEN |  184 | | PASTE |  279 | 
| MEDIA_FAST_FORWARD |  90 | | PROG_YELLOW |  185 | | SYSTEM_NAVIGATION_UP |  280 |
| MUTE |  91 |  | PROG_BLUE |  186 | | SYSTEM_NAVIGATION_DOWN |  281 |
| PAGE_UP |  92 | | APP_SWITCH |  187 |  | SYSTEM_NAVIGATION_LEFT |  282 |
| PAGE_DOWN |  93 | | BUTTON_1 |  188 | | SYSTEM_NAVIGATION_RIGHT |  283 | 
| PICTSYMBOLS |  94 | | BUTTON_2 |  189 | | ALL_APPS |  284 |
| SWITCH_CHARSET |  95 | | BUTTON_3 |  190 | | REFRESH |  285 |
  
