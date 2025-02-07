/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionWaterSportLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterSportLocalService
 * @generated
 */
public class AttractionWaterSportLocalServiceWrapper
	implements AttractionWaterSportLocalService,
			   ServiceWrapper<AttractionWaterSportLocalService> {

	public AttractionWaterSportLocalServiceWrapper() {
		this(null);
	}

	public AttractionWaterSportLocalServiceWrapper(
		AttractionWaterSportLocalService attractionWaterSportLocalService) {

		_attractionWaterSportLocalService = attractionWaterSportLocalService;
	}

	/**
	 * Adds the attraction water sport to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterSportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterSport the attraction water sport
	 * @return the attraction water sport that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterSport
		addAttractionWaterSport(
			com.nbp.jtb.application.form.service.model.AttractionWaterSport
				attractionWaterSport) {

		return _attractionWaterSportLocalService.addAttractionWaterSport(
			attractionWaterSport);
	}

	/**
	 * Creates a new attraction water sport with the primary key. Does not add the attraction water sport to the database.
	 *
	 * @param attractionWaterSportId the primary key for the new attraction water sport
	 * @return the new attraction water sport
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterSport
		createAttractionWaterSport(long attractionWaterSportId) {

		return _attractionWaterSportLocalService.createAttractionWaterSport(
			attractionWaterSportId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterSportLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction water sport from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterSportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterSport the attraction water sport
	 * @return the attraction water sport that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterSport
		deleteAttractionWaterSport(
			com.nbp.jtb.application.form.service.model.AttractionWaterSport
				attractionWaterSport) {

		return _attractionWaterSportLocalService.deleteAttractionWaterSport(
			attractionWaterSport);
	}

	/**
	 * Deletes the attraction water sport with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterSportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport that was removed
	 * @throws PortalException if a attraction water sport with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterSport
			deleteAttractionWaterSport(long attractionWaterSportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterSportLocalService.deleteAttractionWaterSport(
			attractionWaterSportId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterSportLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionWaterSportLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionWaterSportLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionWaterSportLocalService.dynamicQuery();
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

		return _attractionWaterSportLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterSportModelImpl</code>.
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

		return _attractionWaterSportLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterSportModelImpl</code>.
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

		return _attractionWaterSportLocalService.dynamicQuery(
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

		return _attractionWaterSportLocalService.dynamicQueryCount(
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

		return _attractionWaterSportLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterSport
		fetchAttractionWaterSport(long attractionWaterSportId) {

		return _attractionWaterSportLocalService.fetchAttractionWaterSport(
			attractionWaterSportId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionWaterSportLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction water sport with the primary key.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport
	 * @throws PortalException if a attraction water sport with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterSport
			getAttractionWaterSport(long attractionWaterSportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterSportLocalService.getAttractionWaterSport(
			attractionWaterSportId);
	}

	/**
	 * Returns a range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @return the range of attraction water sports
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionWaterSport>
			getAttractionWaterSports(int start, int end) {

		return _attractionWaterSportLocalService.getAttractionWaterSports(
			start, end);
	}

	/**
	 * Returns the number of attraction water sports.
	 *
	 * @return the number of attraction water sports
	 */
	@Override
	public int getAttractionWaterSportsCount() {
		return _attractionWaterSportLocalService.
			getAttractionWaterSportsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionWaterSportLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterSport
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterSportException {

		return _attractionWaterSportLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionWaterSportLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterSportLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction water sport in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterSportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterSport the attraction water sport
	 * @return the attraction water sport that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterSport
		updateAttractionWaterSport(
			com.nbp.jtb.application.form.service.model.AttractionWaterSport
				attractionWaterSport) {

		return _attractionWaterSportLocalService.updateAttractionWaterSport(
			attractionWaterSport);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionWaterSportLocalService.getBasePersistence();
	}

	@Override
	public AttractionWaterSportLocalService getWrappedService() {
		return _attractionWaterSportLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionWaterSportLocalService attractionWaterSportLocalService) {

		_attractionWaterSportLocalService = attractionWaterSportLocalService;
	}

	private AttractionWaterSportLocalService _attractionWaterSportLocalService;

}