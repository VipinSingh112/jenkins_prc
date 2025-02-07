/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HsraApplicationDeskVeri service. Represents a row in the &quot;nbp_hsra_desk_verifi&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationDeskVeriModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriImpl"
)
@ProviderType
public interface HsraApplicationDeskVeri
	extends HsraApplicationDeskVeriModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HsraApplicationDeskVeri, Long>
		HSRA_APPLICATION_DESK_VERI_ID_ACCESSOR =
			new Accessor<HsraApplicationDeskVeri, Long>() {

				@Override
				public Long get(
					HsraApplicationDeskVeri hsraApplicationDeskVeri) {

					return hsraApplicationDeskVeri.
						getHsraApplicationDeskVeriId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HsraApplicationDeskVeri> getTypeClass() {
					return HsraApplicationDeskVeri.class;
				}

			};

}