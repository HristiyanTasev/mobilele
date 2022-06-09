package bg.softuni.mobilele.entity;

import bg.softuni.mobilele.entity.enums.CategoryEnum;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoryEnum category;

    private String imageURL;
    private int startYear;
    private Long endYear;

    @ManyToOne
    private BrandEntity brand;
}
