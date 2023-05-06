import java.util.Date

@Entity(tableName = "mood_entry")
data class MoodEntry(
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "mood") val mood: String,
    @ColumnInfo(name = "notes") val notes: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

