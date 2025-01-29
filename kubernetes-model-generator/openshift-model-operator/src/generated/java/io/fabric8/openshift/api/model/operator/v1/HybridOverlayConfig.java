
package io.fabric8.openshift.api.model.operator.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "hybridClusterNetwork",
    "hybridOverlayVXLANPort"
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
public class HybridOverlayConfig implements Editable<HybridOverlayConfigBuilder>, KubernetesResource
{

    @JsonProperty("hybridClusterNetwork")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ClusterNetworkEntry> hybridClusterNetwork = new ArrayList<>();
    @JsonProperty("hybridOverlayVXLANPort")
    private Long hybridOverlayVXLANPort;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public HybridOverlayConfig() {
    }

    public HybridOverlayConfig(List<ClusterNetworkEntry> hybridClusterNetwork, Long hybridOverlayVXLANPort) {
        super();
        this.hybridClusterNetwork = hybridClusterNetwork;
        this.hybridOverlayVXLANPort = hybridOverlayVXLANPort;
    }

    /**
     * HybridClusterNetwork defines a network space given to nodes on an additional overlay network.
     */
    @JsonProperty("hybridClusterNetwork")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<ClusterNetworkEntry> getHybridClusterNetwork() {
        return hybridClusterNetwork;
    }

    /**
     * HybridClusterNetwork defines a network space given to nodes on an additional overlay network.
     */
    @JsonProperty("hybridClusterNetwork")
    public void setHybridClusterNetwork(List<ClusterNetworkEntry> hybridClusterNetwork) {
        this.hybridClusterNetwork = hybridClusterNetwork;
    }

    /**
     * HybridOverlayVXLANPort defines the VXLAN port number to be used by the additional overlay network. Default is 4789
     */
    @JsonProperty("hybridOverlayVXLANPort")
    public Long getHybridOverlayVXLANPort() {
        return hybridOverlayVXLANPort;
    }

    /**
     * HybridOverlayVXLANPort defines the VXLAN port number to be used by the additional overlay network. Default is 4789
     */
    @JsonProperty("hybridOverlayVXLANPort")
    public void setHybridOverlayVXLANPort(Long hybridOverlayVXLANPort) {
        this.hybridOverlayVXLANPort = hybridOverlayVXLANPort;
    }

    @JsonIgnore
    public HybridOverlayConfigBuilder edit() {
        return new HybridOverlayConfigBuilder(this);
    }

    @JsonIgnore
    public HybridOverlayConfigBuilder toBuilder() {
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
