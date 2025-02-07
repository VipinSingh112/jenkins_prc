/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevDisasterManagementLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementLocalService
 * @generated
 */
public class SezDevDisasterManagementLocalServiceWrapper
	implements ServiceWrapper<SezDevDisasterManagementLocalService>,
			   SezDevDisasterManagementLocalService {

	public SezDevDisasterManagementLocalServiceWrapper() {
		this(null);
	}

	public SezDevDisasterManagementLocalServiceWrapper(
		SezDevDisasterManagementLocalService
			sezDevDisasterManagementLocalService) {

		_sezDevDisasterManagementLocalService =
			sezDevDisasterManagementLocalService;
	}

	/**
	 * Adds the sez dev disaster management to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagement the sez dev disaster management
	 * @return the sez dev disaster management that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagement addSezDevDisasterManagement(
				com.nbp.sez.status.application.form.service.model.
					SezDevDisasterManagement sezDevDisasterManagement) {

		return _sezDevDisasterManagementLocalService.
			addSezDevDisasterManagement(sezDevDisasterManagement);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev disaster management with the primary key. Does not add the sez dev disaster management to the database.
	 *
	 * @param sezDevDisasterManagementId the primary key for the new sez dev disaster management
	 * @return the new sez dev disaster management
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagement createSezDevDisasterManagement(
				long sezDevDisasterManagementId) {

		return _sezDevDisasterManagementLocalService.
			createSezDevDisasterManagement(sezDevDisasterManagementId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev disaster management with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management that was removed
	 * @throws PortalException if a sez dev disaster management with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagement deleteSezDevDisasterManagement(
					long sezDevDisasterManagementId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementLocalService.
			deleteSezDevDisasterManagement(sezDevDisasterManagementId);
	}

	/**
	 * Deletes the sez dev disaster management from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagement the sez dev disaster management
	 * @return the sez dev disaster management that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagement deleteSezDevDisasterManagement(
				com.nbp.sez.status.application.form.service.model.
					SezDevDisasterManagement sezDevDisasterManagement) {

		return _sezDevDisasterManagementLocalService.
			deleteSezDevDisasterManagement(sezDevDisasterManagement);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevDisasterManagementLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevDisasterManagementLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevDisasterManagementLocalService.dynamicQuery();
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

		return _sezDevDisasterManagementLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementModelImpl</code>.
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

		return _sezDevDisasterManagementLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementModelImpl</code>.
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

		return _sezDevDisasterManagementLocalService.dynamicQuery(
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

		return _sezDevDisasterManagementLocalService.dynamicQueryCount(
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

		return _sezDevDisasterManagementLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagement fetchSezDevDisasterManagement(
				long sezDevDisasterManagementId) {

		return _sezDevDisasterManagementLocalService.
			fetchSezDevDisasterManagement(sezDevDisasterManagementId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevDisasterManagementLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevDisasterManagementLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevDisasterManagementLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagement getSezById(long sezStatusApplicationId)
				throws com.nbp.sez.status.application.form.service.exception.
					NoSuchSezDevDisasterManagementException {

		return _sezDevDisasterManagementLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev disaster management with the primary key.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management
	 * @throws PortalException if a sez dev disaster management with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagement getSezDevDisasterManagement(
					long sezDevDisasterManagementId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementLocalService.
			getSezDevDisasterManagement(sezDevDisasterManagementId);
	}

	/**
	 * Returns a range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @return the range of sez dev disaster managements
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagement> getSezDevDisasterManagements(
				int start, int end) {

		return _sezDevDisasterManagementLocalService.
			getSezDevDisasterManagements(start, end);
	}

	/**
	 * Returns the number of sez dev disaster managements.
	 *
	 * @return the number of sez dev disaster managements
	 */
	@Override
	public int getSezDevDisasterManagementsCount() {
		return _sezDevDisasterManagementLocalService.
			getSezDevDisasterManagementsCount();
	}

	/**
	 * Updates the sez dev disaster management in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagement the sez dev disaster management
	 * @return the sez dev disaster management that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagement updateSezDevDisasterManagement(
				com.nbp.sez.status.application.form.service.model.
					SezDevDisasterManagement sezDevDisasterManagement) {

		return _sezDevDisasterManagementLocalService.
			updateSezDevDisasterManagement(sezDevDisasterManagement);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevDisasterManagementLocalService.getBasePersistence();
	}

	@Override
	public SezDevDisasterManagementLocalService getWrappedService() {
		return _sezDevDisasterManagementLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevDisasterManagementLocalService
			sezDevDisasterManagementLocalService) {

		_sezDevDisasterManagementLocalService =
			sezDevDisasterManagementLocalService;
	}

	private SezDevDisasterManagementLocalService
		_sezDevDisasterManagementLocalService;

}