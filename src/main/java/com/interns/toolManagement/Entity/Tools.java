package com.interns.toolManagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tools")
public class Tools {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tool_object_Id;
    private String manufacturer;
    private double max_usage_capacity;
    private double no_of_times_used;
    private double worn_out_percentage;
    private double price;
    private double wornOut_limit;
    private int uses_left;
    private boolean usage_status;

    @ManyToOne
    @JoinColumn(name = "fk_tool_id")
    private Master master;
    @OneToOne(mappedBy = "tool",cascade = CascadeType.ALL)
    private Events events;
}
