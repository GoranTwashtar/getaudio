var exec = require('cordova/exec');

exports.SPEAKER = 'speaker';
exports.EARPIECE = 'earpiece';

exports.setAudioMode = function (mode) {
	cordova.exec(null, null, 'GetAudioPlugin', 'getAudioMode', [mode]);
};
