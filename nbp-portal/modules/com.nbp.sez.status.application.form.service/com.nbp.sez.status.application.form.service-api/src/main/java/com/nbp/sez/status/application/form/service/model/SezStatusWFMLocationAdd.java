/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezStatusWFMLocationAdd service. Represents a row in the &quot;nbp_sez_status_work_home_loc&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFMLocationAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezStatusWFMLocationAddImpl"
)
@ProviderType
public interface SezStatusWFMLocationAdd
	extends PersistedModel, SezStatusWFMLocationAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusWFMLocationAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezStatusWFMLocationAdd, Long>
		SEZ_STATUS_WFH_LOC_ID_ACCESSOR =
			new Accessor<SezStatusWFMLocationAdd, Long>() {

				@Override
				public Long get(
					SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

					return sezStatusWFMLocationAdd.getSezStatusWFHLocId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezStatusWFMLocationAdd> getTypeClass() {
					return SezStatusWFMLocationAdd.class;
				}

			};

}