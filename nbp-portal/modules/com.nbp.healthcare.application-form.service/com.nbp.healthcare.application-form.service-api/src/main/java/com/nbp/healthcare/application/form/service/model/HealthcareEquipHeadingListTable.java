/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;nbp_health_equip_heading_list&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthcareEquipHeadingList
 * @generated
 */
public class HealthcareEquipHeadingListTable
	extends BaseTable<HealthcareEquipHeadingListTable> {

	public static final HealthcareEquipHeadingListTable INSTANCE =
		new HealthcareEquipHeadingListTable();

	public final Column<HealthcareEquipHeadingListTable, Long>
		healthcareEquipHeadingListId = createColumn(
			"healthcareEquipHeadingListId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<HealthcareEquipHeadingListTable, String>
		healthcareDescription = createColumn(
			"healthcareDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthcareEquipHeadingListTable, String>
		healthcareHsHeading = createColumn(
			"healthcareHsHeading", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthcareEquipHeadingListTable, String>
		healthcareSubHeading = createColumn(
			"healthcareSubHeading", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private HealthcareEquipHeadingListTable() {
		super(
			"nbp_health_equip_heading_list",
			HealthcareEquipHeadingListTable::new);
	}

}