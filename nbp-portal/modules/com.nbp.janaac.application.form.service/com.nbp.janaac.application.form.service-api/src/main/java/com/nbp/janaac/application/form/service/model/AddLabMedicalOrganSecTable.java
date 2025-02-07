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
 * The table class for the &quot;nbp_janaac_add_lab_med_or_sec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganSec
 * @generated
 */
public class AddLabMedicalOrganSecTable
	extends BaseTable<AddLabMedicalOrganSecTable> {

	public static final AddLabMedicalOrganSecTable INSTANCE =
		new AddLabMedicalOrganSecTable();

	public final Column<AddLabMedicalOrganSecTable, Long>
		addLabMedicalOrganSecId = createColumn(
			"addLabMedicalOrganSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabMedicalOrganSecTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, String> product =
		createColumn(
			"product", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, String> examination =
		createColumn(
			"examination", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, String> methods =
		createColumn(
			"methods", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, String> equipment =
		createColumn(
			"equipment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, String> referenceRange =
		createColumn(
			"referenceRange", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, String>
		measurementUncertainty = createColumn(
			"measurementUncertainty", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalOrganSecTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabMedicalOrganSecTable() {
		super("nbp_janaac_add_lab_med_or_sec", AddLabMedicalOrganSecTable::new);
	}

}