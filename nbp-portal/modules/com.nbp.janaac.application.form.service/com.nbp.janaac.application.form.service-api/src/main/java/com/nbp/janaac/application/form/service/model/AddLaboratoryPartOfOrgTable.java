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
 * The table class for the &quot;nbp_janaac_add_ins_lab_org&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLaboratoryPartOfOrg
 * @generated
 */
public class AddLaboratoryPartOfOrgTable
	extends BaseTable<AddLaboratoryPartOfOrgTable> {

	public static final AddLaboratoryPartOfOrgTable INSTANCE =
		new AddLaboratoryPartOfOrgTable();

	public final Column<AddLaboratoryPartOfOrgTable, Long>
		addLaboratoryPartOfOrgId = createColumn(
			"addLaboratoryPartOfOrgId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLaboratoryPartOfOrgTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLaboratoryPartOfOrgTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLaboratoryPartOfOrgTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLaboratoryPartOfOrgTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLaboratoryPartOfOrgTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLaboratoryPartOfOrgTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLaboratoryPartOfOrgTable, String>
		laboratoryPartOfOrgName = createColumn(
			"laboratoryPartOfOrgName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLaboratoryPartOfOrgTable, String>
		laboratoryPartOfOrgPosition = createColumn(
			"laboratoryPartOfOrgPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLaboratoryPartOfOrgTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLaboratoryPartOfOrgTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLaboratoryPartOfOrgTable() {
		super("nbp_janaac_add_ins_lab_org", AddLaboratoryPartOfOrgTable::new);
	}

}