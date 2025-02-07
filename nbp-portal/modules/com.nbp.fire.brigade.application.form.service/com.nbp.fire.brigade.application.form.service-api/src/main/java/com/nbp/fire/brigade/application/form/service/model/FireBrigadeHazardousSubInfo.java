/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FireBrigadeHazardousSubInfo service. Represents a row in the &quot;nbp_fire_hazar_sub_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeHazardousSubInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoImpl"
)
@ProviderType
public interface FireBrigadeHazardousSubInfo
	extends FireBrigadeHazardousSubInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FireBrigadeHazardousSubInfo, Long>
		FIRE_BRIGADE_HAZARDOUS_SUB_INFO_ID_ACCESSOR =
			new Accessor<FireBrigadeHazardousSubInfo, Long>() {

				@Override
				public Long get(
					FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

					return fireBrigadeHazardousSubInfo.
						getFireBrigadeHazardousSubInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FireBrigadeHazardousSubInfo> getTypeClass() {
					return FireBrigadeHazardousSubInfo.class;
				}

			};

}