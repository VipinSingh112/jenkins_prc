/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionTravelHaltAppLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelHaltAppLocalService
 * @generated
 */
public class AttractionTravelHaltAppLocalServiceWrapper
	implements AttractionTravelHaltAppLocalService,
			   ServiceWrapper<AttractionTravelHaltAppLocalService> {

	public AttractionTravelHaltAppLocalServiceWrapper() {
		this(null);
	}

	public AttractionTravelHaltAppLocalServiceWrapper(
		AttractionTravelHaltAppLocalService
			attractionTravelHaltAppLocalService) {

		_attractionTravelHaltAppLocalService =
			attractionTravelHaltAppLocalService;
	}

	/**
	 * Adds the attraction travel halt app to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelHaltAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelHaltApp the attraction travel halt app
	 * @return the attraction travel halt app that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
		addAttractionTravelHaltApp(
			com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
				attractionTravelHaltApp) {

		return _attractionTravelHaltAppLocalService.addAttractionTravelHaltApp(
			attractionTravelHaltApp);
	}

	/**
	 * Creates a new attraction travel halt app with the primary key. Does not add the attraction travel halt app to the database.
	 *
	 * @param attractionTravelHaltAppId the primary key for the new attraction travel halt app
	 * @return the new attraction travel halt app
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
		createAttractionTravelHaltApp(long attractionTravelHaltAppId) {

		return _attractionTravelHaltAppLocalService.
			createAttractionTravelHaltApp(attractionTravelHaltAppId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelHaltAppLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction travel halt app from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelHaltAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelHaltApp the attraction travel halt app
	 * @return the attraction travel halt app that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
		deleteAttractionTravelHaltApp(
			com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
				attractionTravelHaltApp) {

		return _attractionTravelHaltAppLocalService.
			deleteAttractionTravelHaltApp(attractionTravelHaltApp);
	}

	/**
	 * Deletes the attraction travel halt app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelHaltAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app that was removed
	 * @throws PortalException if a attraction travel halt app with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
			deleteAttractionTravelHaltApp(long attractionTravelHaltAppId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelHaltAppLocalService.
			deleteAttractionTravelHaltApp(attractionTravelHaltAppId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelHaltAppLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionTravelHaltAppLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionTravelHaltAppLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionTravelHaltAppLocalService.dynamicQuery();
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

		return _attractionTravelHaltAppLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelHaltAppModelImpl</code>.
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

		return _attractionTravelHaltAppLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelHaltAppModelImpl</code>.
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

		return _attractionTravelHaltAppLocalService.dynamicQuery(
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

		return _attractionTravelHaltAppLocalService.dynamicQueryCount(
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

		return _attractionTravelHaltAppLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
		fetchAttractionTravelHaltApp(long attractionTravelHaltAppId) {

		return _attractionTravelHaltAppLocalService.
			fetchAttractionTravelHaltApp(attractionTravelHaltAppId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionTravelHaltAppLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction travel halt app with the primary key.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app
	 * @throws PortalException if a attraction travel halt app with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
			getAttractionTravelHaltApp(long attractionTravelHaltAppId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelHaltAppLocalService.getAttractionTravelHaltApp(
			attractionTravelHaltAppId);
	}

	/**
	 * Returns a range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @return the range of attraction travel halt apps
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp>
			getAttractionTravelHaltApps(int start, int end) {

		return _attractionTravelHaltAppLocalService.getAttractionTravelHaltApps(
			start, end);
	}

	/**
	 * Returns the number of attraction travel halt apps.
	 *
	 * @return the number of attraction travel halt apps
	 */
	@Override
	public int getAttractionTravelHaltAppsCount() {
		return _attractionTravelHaltAppLocalService.
			getAttractionTravelHaltAppsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionTravelHaltAppLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelHaltAppException {

		return _attractionTravelHaltAppLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionTravelHaltAppLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelHaltAppLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction travel halt app in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelHaltAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelHaltApp the attraction travel halt app
	 * @return the attraction travel halt app that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
		updateAttractionTravelHaltApp(
			com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp
				attractionTravelHaltApp) {

		return _attractionTravelHaltAppLocalService.
			updateAttractionTravelHaltApp(attractionTravelHaltApp);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionTravelHaltAppLocalService.getBasePersistence();
	}

	@Override
	public AttractionTravelHaltAppLocalService getWrappedService() {
		return _attractionTravelHaltAppLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionTravelHaltAppLocalService
			attractionTravelHaltAppLocalService) {

		_attractionTravelHaltAppLocalService =
			attractionTravelHaltAppLocalService;
	}

	private AttractionTravelHaltAppLocalService
		_attractionTravelHaltAppLocalService;

}