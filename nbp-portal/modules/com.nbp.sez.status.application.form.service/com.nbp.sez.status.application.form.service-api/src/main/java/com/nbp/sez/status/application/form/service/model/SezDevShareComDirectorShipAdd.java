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
 * The extended model interface for the SezDevShareComDirectorShipAdd service. Represents a row in the &quot;nbp_sez_dev_share_com_dire_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareComDirectorShipAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezDevShareComDirectorShipAddImpl"
)
@ProviderType
public interface SezDevShareComDirectorShipAdd
	extends PersistedModel, SezDevShareComDirectorShipAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareComDirectorShipAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezDevShareComDirectorShipAdd, Long>
		SEZ_DEV_SHAR_COM_DIRECTOR_SHIP_ADD_ID_ACCESSOR =
			new Accessor<SezDevShareComDirectorShipAdd, Long>() {

				@Override
				public Long get(
					SezDevShareComDirectorShipAdd
						sezDevShareComDirectorShipAdd) {

					return sezDevShareComDirectorShipAdd.
						getSezDevSharComDirectorShipAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezDevShareComDirectorShipAdd> getTypeClass() {
					return SezDevShareComDirectorShipAdd.class;
				}

			};

}