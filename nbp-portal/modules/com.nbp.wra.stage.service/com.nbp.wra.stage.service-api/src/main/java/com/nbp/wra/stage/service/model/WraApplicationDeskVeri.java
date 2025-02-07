/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the WraApplicationDeskVeri service. Represents a row in the &quot;nbp_wra_desk_verifi&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationDeskVeriModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.wra.stage.service.model.impl.WraApplicationDeskVeriImpl"
)
@ProviderType
public interface WraApplicationDeskVeri
	extends PersistedModel, WraApplicationDeskVeriModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.wra.stage.service.model.impl.WraApplicationDeskVeriImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<WraApplicationDeskVeri, Long>
		WRA_APPLICATION_DESK_VERI_ID_ACCESSOR =
			new Accessor<WraApplicationDeskVeri, Long>() {

				@Override
				public Long get(WraApplicationDeskVeri wraApplicationDeskVeri) {
					return wraApplicationDeskVeri.getWraApplicationDeskVeriId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<WraApplicationDeskVeri> getTypeClass() {
					return WraApplicationDeskVeri.class;
				}

			};

}