/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_add_lab_med_or_fir&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganFirst
 * @generated
 */
public class AddLabMedicalOrganFirstTable
	extends BaseTable<AddLabMedicalOrganFirstTable> {

	public static final AddLabMedicalOrganFirstTable INSTANCE =
		new AddLabMedicalOrganFirstTable();

	public final Column<AddLabMedicalOrganFirstTable, Long>
		addLabMedicalOrganFirstId = createColumn(
			"addLabMedicalOrganFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabMedicalOrganFirstTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, String> nameOfStaff =
		createColumn(
			"nameOfStaff", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, String> jobTitle =
		createColumn(
			"jobTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, String>
		majorResponsibilities = createColumn(
			"majorResponsibilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganFirstTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabMedicalOrganFirstTable() {
		super(
			"nbp_janaac_add_lab_med_or_fir", AddLabMedicalOrganFirstTable::new);
	}

}