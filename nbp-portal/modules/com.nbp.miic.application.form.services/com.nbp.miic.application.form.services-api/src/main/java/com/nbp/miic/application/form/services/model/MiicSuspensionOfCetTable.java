/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_miic_Suspension&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCet
 * @generated
 */
public class MiicSuspensionOfCetTable
	extends BaseTable<MiicSuspensionOfCetTable> {

	public static final MiicSuspensionOfCetTable INSTANCE =
		new MiicSuspensionOfCetTable();

	public final Column<MiicSuspensionOfCetTable, Long> miicSuspensionOfCetId =
		createColumn(
			"miicSuspensionOfCetId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiicSuspensionOfCetTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, String> indicationOfUrgency =
		createColumn(
			"indicationOfUrgency", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, String> requestForSuspension =
		createColumn(
			"requestForSuspension", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, String> evidenceOfInability =
		createColumn(
			"evidenceOfInability", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, String>
		evidenceOfConsultation = createColumn(
			"evidenceOfConsultation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, String>
		evidenceOfConsultationForeign = createColumn(
			"evidenceOfConsultationForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, String>
		nameOfAuthorizedPersonnel = createColumn(
			"nameOfAuthorizedPersonnel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSuspensionOfCetTable, Long> miicApplicationId =
		createColumn(
			"miicApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MiicSuspensionOfCetTable() {
		super("nbp_miic_Suspension", MiicSuspensionOfCetTable::new);
	}

}