/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JtbApplicationDeskVeriLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationDeskVeriLocalService
 * @generated
 */
public class JtbApplicationDeskVeriLocalServiceWrapper
	implements JtbApplicationDeskVeriLocalService,
			   ServiceWrapper<JtbApplicationDeskVeriLocalService> {

	public JtbApplicationDeskVeriLocalServiceWrapper() {
		this(null);
	}

	public JtbApplicationDeskVeriLocalServiceWrapper(
		JtbApplicationDeskVeriLocalService jtbApplicationDeskVeriLocalService) {

		_jtbApplicationDeskVeriLocalService =
			jtbApplicationDeskVeriLocalService;
	}

	/**
	 * Adds the jtb application desk veri to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationDeskVeri the jtb application desk veri
	 * @return the jtb application desk veri that was added
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
		addJtbApplicationDeskVeri(
			com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
				jtbApplicationDeskVeri) {

		return _jtbApplicationDeskVeriLocalService.addJtbApplicationDeskVeri(
			jtbApplicationDeskVeri);
	}

	/**
	 * Creates a new jtb application desk veri with the primary key. Does not add the jtb application desk veri to the database.
	 *
	 * @param jtbApplicationDeskVeriId the primary key for the new jtb application desk veri
	 * @return the new jtb application desk veri
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
		createJtbApplicationDeskVeri(long jtbApplicationDeskVeriId) {

		return _jtbApplicationDeskVeriLocalService.createJtbApplicationDeskVeri(
			jtbApplicationDeskVeriId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationDeskVeriLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteJtbAppDV_ById(long jtbApplicationId) {
		_jtbApplicationDeskVeriLocalService.deleteJtbAppDV_ById(
			jtbApplicationId);
	}

	/**
	 * Deletes the jtb application desk veri from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationDeskVeri the jtb application desk veri
	 * @return the jtb application desk veri that was removed
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
		deleteJtbApplicationDeskVeri(
			com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
				jtbApplicationDeskVeri) {

		return _jtbApplicationDeskVeriLocalService.deleteJtbApplicationDeskVeri(
			jtbApplicationDeskVeri);
	}

	/**
	 * Deletes the jtb application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri that was removed
	 * @throws PortalException if a jtb application desk veri with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
			deleteJtbApplicationDeskVeri(long jtbApplicationDeskVeriId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationDeskVeriLocalService.deleteJtbApplicationDeskVeri(
			jtbApplicationDeskVeriId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationDeskVeriLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbApplicationDeskVeriLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbApplicationDeskVeriLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbApplicationDeskVeriLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _jtbApplicationDeskVeriLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _jtbApplicationDeskVeriLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _jtbApplicationDeskVeriLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _jtbApplicationDeskVeriLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _jtbApplicationDeskVeriLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
		fetchJtbApplicationDeskVeri(long jtbApplicationDeskVeriId) {

		return _jtbApplicationDeskVeriLocalService.fetchJtbApplicationDeskVeri(
			jtbApplicationDeskVeriId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbApplicationDeskVeriLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri>
			getApplicationDeskVerificationList(long jtbApplicationId) {

		return _jtbApplicationDeskVeriLocalService.
			getApplicationDeskVerificationList(jtbApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbApplicationDeskVeriLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jtb application desk veri with the primary key.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri
	 * @throws PortalException if a jtb application desk veri with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
			getJtbApplicationDeskVeri(long jtbApplicationDeskVeriId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationDeskVeriLocalService.getJtbApplicationDeskVeri(
			jtbApplicationDeskVeriId);
	}

	/**
	 * Returns a range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @return the range of jtb application desk veris
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri>
			getJtbApplicationDeskVeris(int start, int end) {

		return _jtbApplicationDeskVeriLocalService.getJtbApplicationDeskVeris(
			start, end);
	}

	/**
	 * Returns the number of jtb application desk veris.
	 *
	 * @return the number of jtb application desk veris
	 */
	@Override
	public int getJtbApplicationDeskVerisCount() {
		return _jtbApplicationDeskVeriLocalService.
			getJtbApplicationDeskVerisCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbApplicationDeskVeriLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationDeskVeriLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jtb application desk veri in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationDeskVeri the jtb application desk veri
	 * @return the jtb application desk veri that was updated
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
		updateJtbApplicationDeskVeri(
			com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri
				jtbApplicationDeskVeri) {

		return _jtbApplicationDeskVeriLocalService.updateJtbApplicationDeskVeri(
			jtbApplicationDeskVeri);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbApplicationDeskVeriLocalService.getBasePersistence();
	}

	@Override
	public JtbApplicationDeskVeriLocalService getWrappedService() {
		return _jtbApplicationDeskVeriLocalService;
	}

	@Override
	public void setWrappedService(
		JtbApplicationDeskVeriLocalService jtbApplicationDeskVeriLocalService) {

		_jtbApplicationDeskVeriLocalService =
			jtbApplicationDeskVeriLocalService;
	}

	private JtbApplicationDeskVeriLocalService
		_jtbApplicationDeskVeriLocalService;

}