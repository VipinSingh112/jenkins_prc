/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_fire_certi_purpose_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCerPurposeInfo
 * @generated
 */
public class FireBrigadeCerPurposeInfoTable
	extends BaseTable<FireBrigadeCerPurposeInfoTable> {

	public static final FireBrigadeCerPurposeInfoTable INSTANCE =
		new FireBrigadeCerPurposeInfoTable();

	public final Column<FireBrigadeCerPurposeInfoTable, Long>
		fireBrigadeCerPurposeInfoId = createColumn(
			"fireBrigadeCerPurposeInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FireBrigadeCerPurposeInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCerPurposeInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCerPurposeInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCerPurposeInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCerPurposeInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCerPurposeInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCerPurposeInfoTable, String>
		certificatePurposePre = createColumn(
			"certificatePurposePre", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCerPurposeInfoTable, String>
		otherCertificatePurpose = createColumn(
			"otherCertificatePurpose", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCerPurposeInfoTable, Long>
		fireBrigadeApplicationId = createColumn(
			"fireBrigadeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FireBrigadeCerPurposeInfoTable() {
		super(
			"nbp_fire_certi_purpose_info", FireBrigadeCerPurposeInfoTable::new);
	}

}