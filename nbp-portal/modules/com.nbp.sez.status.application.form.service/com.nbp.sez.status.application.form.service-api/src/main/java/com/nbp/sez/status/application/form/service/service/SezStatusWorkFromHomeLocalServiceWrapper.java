/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusWorkFromHomeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWorkFromHomeLocalService
 * @generated
 */
public class SezStatusWorkFromHomeLocalServiceWrapper
	implements ServiceWrapper<SezStatusWorkFromHomeLocalService>,
			   SezStatusWorkFromHomeLocalService {

	public SezStatusWorkFromHomeLocalServiceWrapper() {
		this(null);
	}

	public SezStatusWorkFromHomeLocalServiceWrapper(
		SezStatusWorkFromHomeLocalService sezStatusWorkFromHomeLocalService) {

		_sezStatusWorkFromHomeLocalService = sezStatusWorkFromHomeLocalService;
	}

	/**
	 * Adds the sez status work from home to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWorkFromHomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWorkFromHome the sez status work from home
	 * @return the sez status work from home that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome
			addSezStatusWorkFromHome(
				com.nbp.sez.status.application.form.service.model.
					SezStatusWorkFromHome sezStatusWorkFromHome) {

		return _sezStatusWorkFromHomeLocalService.addSezStatusWorkFromHome(
			sezStatusWorkFromHome);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWorkFromHomeLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status work from home with the primary key. Does not add the sez status work from home to the database.
	 *
	 * @param sezStatusWorkFromHomeId the primary key for the new sez status work from home
	 * @return the new sez status work from home
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome
			createSezStatusWorkFromHome(long sezStatusWorkFromHomeId) {

		return _sezStatusWorkFromHomeLocalService.createSezStatusWorkFromHome(
			sezStatusWorkFromHomeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWorkFromHomeLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status work from home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWorkFromHomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home that was removed
	 * @throws PortalException if a sez status work from home with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome
				deleteSezStatusWorkFromHome(long sezStatusWorkFromHomeId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWorkFromHomeLocalService.deleteSezStatusWorkFromHome(
			sezStatusWorkFromHomeId);
	}

	/**
	 * Deletes the sez status work from home from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWorkFromHomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWorkFromHome the sez status work from home
	 * @return the sez status work from home that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome
			deleteSezStatusWorkFromHome(
				com.nbp.sez.status.application.form.service.model.
					SezStatusWorkFromHome sezStatusWorkFromHome) {

		return _sezStatusWorkFromHomeLocalService.deleteSezStatusWorkFromHome(
			sezStatusWorkFromHome);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusWorkFromHomeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusWorkFromHomeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusWorkFromHomeLocalService.dynamicQuery();
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

		return _sezStatusWorkFromHomeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusWorkFromHomeModelImpl</code>.
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

		return _sezStatusWorkFromHomeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusWorkFromHomeModelImpl</code>.
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

		return _sezStatusWorkFromHomeLocalService.dynamicQuery(
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

		return _sezStatusWorkFromHomeLocalService.dynamicQueryCount(
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

		return _sezStatusWorkFromHomeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome
			fetchSezStatusWorkFromHome(long sezStatusWorkFromHomeId) {

		return _sezStatusWorkFromHomeLocalService.fetchSezStatusWorkFromHome(
			sezStatusWorkFromHomeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusWorkFromHomeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusWorkFromHomeLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusWorkFromHomeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWorkFromHomeLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome
				getSezById(long sezStatusApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezStatusWorkFromHomeException {

		return _sezStatusWorkFromHomeLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez status work from home with the primary key.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home
	 * @throws PortalException if a sez status work from home with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome
				getSezStatusWorkFromHome(long sezStatusWorkFromHomeId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWorkFromHomeLocalService.getSezStatusWorkFromHome(
			sezStatusWorkFromHomeId);
	}

	/**
	 * Returns a range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @return the range of sez status work from homes
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezStatusWorkFromHome> getSezStatusWorkFromHomes(
				int start, int end) {

		return _sezStatusWorkFromHomeLocalService.getSezStatusWorkFromHomes(
			start, end);
	}

	/**
	 * Returns the number of sez status work from homes.
	 *
	 * @return the number of sez status work from homes
	 */
	@Override
	public int getSezStatusWorkFromHomesCount() {
		return _sezStatusWorkFromHomeLocalService.
			getSezStatusWorkFromHomesCount();
	}

	/**
	 * Updates the sez status work from home in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWorkFromHomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWorkFromHome the sez status work from home
	 * @return the sez status work from home that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome
			updateSezStatusWorkFromHome(
				com.nbp.sez.status.application.form.service.model.
					SezStatusWorkFromHome sezStatusWorkFromHome) {

		return _sezStatusWorkFromHomeLocalService.updateSezStatusWorkFromHome(
			sezStatusWorkFromHome);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusWorkFromHomeLocalService.getBasePersistence();
	}

	@Override
	public SezStatusWorkFromHomeLocalService getWrappedService() {
		return _sezStatusWorkFromHomeLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusWorkFromHomeLocalService sezStatusWorkFromHomeLocalService) {

		_sezStatusWorkFromHomeLocalService = sezStatusWorkFromHomeLocalService;
	}

	private SezStatusWorkFromHomeLocalService
		_sezStatusWorkFromHomeLocalService;

}