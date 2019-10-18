/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface RecognitionMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.RecognitionMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The use case most closely describing the audio content to be recognized.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionMetadata.InteractionType interaction_type = 1;
   * </code>
   */
  int getInteractionTypeValue();
  /**
   *
   *
   * <pre>
   * The use case most closely describing the audio content to be recognized.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionMetadata.InteractionType interaction_type = 1;
   * </code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionMetadata.InteractionType getInteractionType();

  /**
   *
   *
   * <pre>
   * The industry vertical to which this speech recognition request most
   * closely applies. This is most indicative of the topics contained
   * in the audio.  Use the 6-digit NAICS code to identify the industry
   * vertical - see https://www.naics.com/search/.
   * </pre>
   *
   * <code>uint32 industry_naics_code_of_audio = 3;</code>
   */
  int getIndustryNaicsCodeOfAudio();

  /**
   *
   *
   * <pre>
   * The audio type that most closely describes the audio being recognized.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1p1beta1.RecognitionMetadata.MicrophoneDistance microphone_distance = 4;
   * </code>
   */
  int getMicrophoneDistanceValue();
  /**
   *
   *
   * <pre>
   * The audio type that most closely describes the audio being recognized.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1p1beta1.RecognitionMetadata.MicrophoneDistance microphone_distance = 4;
   * </code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionMetadata.MicrophoneDistance getMicrophoneDistance();

  /**
   *
   *
   * <pre>
   * The original media the speech was recorded on.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1p1beta1.RecognitionMetadata.OriginalMediaType original_media_type = 5;
   * </code>
   */
  int getOriginalMediaTypeValue();
  /**
   *
   *
   * <pre>
   * The original media the speech was recorded on.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1p1beta1.RecognitionMetadata.OriginalMediaType original_media_type = 5;
   * </code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionMetadata.OriginalMediaType getOriginalMediaType();

  /**
   *
   *
   * <pre>
   * The type of device the speech was recorded with.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1p1beta1.RecognitionMetadata.RecordingDeviceType recording_device_type = 6;
   * </code>
   */
  int getRecordingDeviceTypeValue();
  /**
   *
   *
   * <pre>
   * The type of device the speech was recorded with.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1p1beta1.RecognitionMetadata.RecordingDeviceType recording_device_type = 6;
   * </code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionMetadata.RecordingDeviceType
      getRecordingDeviceType();

  /**
   *
   *
   * <pre>
   * The device used to make the recording.  Examples 'Nexus 5X' or
   * 'Polycom SoundStation IP 6000' or 'POTS' or 'VoIP' or
   * 'Cardioid Microphone'.
   * </pre>
   *
   * <code>string recording_device_name = 7;</code>
   */
  java.lang.String getRecordingDeviceName();
  /**
   *
   *
   * <pre>
   * The device used to make the recording.  Examples 'Nexus 5X' or
   * 'Polycom SoundStation IP 6000' or 'POTS' or 'VoIP' or
   * 'Cardioid Microphone'.
   * </pre>
   *
   * <code>string recording_device_name = 7;</code>
   */
  com.google.protobuf.ByteString getRecordingDeviceNameBytes();

  /**
   *
   *
   * <pre>
   * Mime type of the original audio file.  For example `audio/m4a`,
   * `audio/x-alaw-basic`, `audio/mp3`, `audio/3gpp`.
   * A list of possible audio mime types is maintained at
   * http://www.iana.org/assignments/media-types/media-types.xhtml#audio
   * </pre>
   *
   * <code>string original_mime_type = 8;</code>
   */
  java.lang.String getOriginalMimeType();
  /**
   *
   *
   * <pre>
   * Mime type of the original audio file.  For example `audio/m4a`,
   * `audio/x-alaw-basic`, `audio/mp3`, `audio/3gpp`.
   * A list of possible audio mime types is maintained at
   * http://www.iana.org/assignments/media-types/media-types.xhtml#audio
   * </pre>
   *
   * <code>string original_mime_type = 8;</code>
   */
  com.google.protobuf.ByteString getOriginalMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Obfuscated (privacy-protected) ID of the user, to identify number of
   * unique users using the service.
   * </pre>
   *
   * <code>int64 obfuscated_id = 9 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  long getObfuscatedId();

  /**
   *
   *
   * <pre>
   * Description of the content. Eg. "Recordings of federal supreme court
   * hearings from 2012".
   * </pre>
   *
   * <code>string audio_topic = 10;</code>
   */
  java.lang.String getAudioTopic();
  /**
   *
   *
   * <pre>
   * Description of the content. Eg. "Recordings of federal supreme court
   * hearings from 2012".
   * </pre>
   *
   * <code>string audio_topic = 10;</code>
   */
  com.google.protobuf.ByteString getAudioTopicBytes();
}
