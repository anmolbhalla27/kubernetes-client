
package io.fabric8.openshift.api.model.machine.v1alpha1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "availabilityZone",
    "deviceType",
    "diskSize",
    "sourceType",
    "sourceUUID",
    "volumeType"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class RootVolume implements Editable<RootVolumeBuilder>, KubernetesResource
{

    @JsonProperty("availabilityZone")
    private String availabilityZone;
    @JsonProperty("deviceType")
    private String deviceType;
    @JsonProperty("diskSize")
    private Integer diskSize;
    @JsonProperty("sourceType")
    private String sourceType;
    @JsonProperty("sourceUUID")
    private String sourceUUID;
    @JsonProperty("volumeType")
    private String volumeType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public RootVolume() {
    }

    public RootVolume(String availabilityZone, String deviceType, Integer diskSize, String sourceType, String sourceUUID, String volumeType) {
        super();
        this.availabilityZone = availabilityZone;
        this.deviceType = deviceType;
        this.diskSize = diskSize;
        this.sourceType = sourceType;
        this.sourceUUID = sourceUUID;
        this.volumeType = volumeType;
    }

    /**
     * availabilityZone specifies the Cinder availability where the root volume will be created.
     */
    @JsonProperty("availabilityZone")
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * availabilityZone specifies the Cinder availability where the root volume will be created.
     */
    @JsonProperty("availabilityZone")
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * Deprecated: deviceType will be silently ignored. There is no replacement.
     */
    @JsonProperty("deviceType")
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Deprecated: deviceType will be silently ignored. There is no replacement.
     */
    @JsonProperty("deviceType")
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * diskSize specifies the size, in GB, of the created root volume.
     */
    @JsonProperty("diskSize")
    public Integer getDiskSize() {
        return diskSize;
    }

    /**
     * diskSize specifies the size, in GB, of the created root volume.
     */
    @JsonProperty("diskSize")
    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    /**
     * Deprecated: sourceType will be silently ignored. There is no replacement.
     */
    @JsonProperty("sourceType")
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Deprecated: sourceType will be silently ignored. There is no replacement.
     */
    @JsonProperty("sourceType")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * sourceUUID specifies the UUID of a glance image used to populate the root volume. Deprecated: set image in the platform spec instead. This will be ignored if image is set in the platform spec.
     */
    @JsonProperty("sourceUUID")
    public String getSourceUUID() {
        return sourceUUID;
    }

    /**
     * sourceUUID specifies the UUID of a glance image used to populate the root volume. Deprecated: set image in the platform spec instead. This will be ignored if image is set in the platform spec.
     */
    @JsonProperty("sourceUUID")
    public void setSourceUUID(String sourceUUID) {
        this.sourceUUID = sourceUUID;
    }

    /**
     * volumeType specifies a volume type to use when creating the root volume. If not specified the default volume type will be used.
     */
    @JsonProperty("volumeType")
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * volumeType specifies a volume type to use when creating the root volume. If not specified the default volume type will be used.
     */
    @JsonProperty("volumeType")
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @JsonIgnore
    public RootVolumeBuilder edit() {
        return new RootVolumeBuilder(this);
    }

    @JsonIgnore
    public RootVolumeBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
