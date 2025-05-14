{% if "PostgreSQL" in values.features %}
package com.zwift.persistence.entity.{{ values.name | lower | replace("-", "") }};

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String name;

    // Getters and Setters
}
{% endif %}
