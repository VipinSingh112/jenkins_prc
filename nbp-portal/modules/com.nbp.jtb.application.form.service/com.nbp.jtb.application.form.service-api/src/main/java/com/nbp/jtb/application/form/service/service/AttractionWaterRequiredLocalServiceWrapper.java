/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionWaterRequiredLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterRequiredLocalService
 * @generated
 */
public class AttractionWaterRequiredLocalServiceWrapper
	implements AttractionWaterRequiredLocalService,
			   ServiceWrapper<AttractionWaterRequiredLocalService> {

	public AttractionWaterRequiredLocalServiceWrapper() {
		this(null);
	}

	public AttractionWaterRequiredLocalServiceWrapper(
		AttractionWaterRequiredLocalService
			attractionWaterRequiredLocalService) {

		_attractionWaterRequiredLocalService =
			attractionWaterRequiredLocalService;
	}

	/**
	 * Adds the attraction water required to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterRequiredLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterRequired the attraction water required
	 * @return the attraction water required that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterRequired
		addAttractionWaterRequired(
			com.nbp.jtb.application.form.service.model.AttractionWaterRequired
				attractionWaterRequired) {

		return _attractionWaterRequiredLocalService.addAttractionWaterRequired(
			attractionWaterRequired);
	}

	/**
	 * Creates a new attraction water required with the primary key. Does not add the attraction water required to the database.
	 *
	 * @param attractionWaterRequiredId the primary key for the new attraction water required
	 * @return the new attraction water required
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterRequired
		createAttractionWaterRequired(long attractionWaterRequiredId) {

		return _attractionWaterRequiredLocalService.
			createAttractionWaterRequired(attractionWaterRequiredId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterRequiredLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction water required from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterRequiredLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterRequired the attraction water required
	 * @return the attraction water required that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterRequired
		deleteAttractionWaterRequired(
			com.nbp.jtb.application.form.service.model.AttractionWaterRequired
				attractionWaterRequired) {

		return _attractionWaterRequiredLocalService.
			deleteAttractionWaterRequired(attractionWaterRequired);
	}

	/**
	 * Deletes the attraction water required with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterRequiredLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required that was removed
	 * @throws PortalException if a attraction water required with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterRequired
			deleteAttractionWaterRequired(long attractionWaterRequiredId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterRequiredLocalService.
			deleteAttractionWaterRequired(attractionWaterRequiredId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterRequiredLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionWaterRequiredLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionWaterRequiredLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionWaterRequiredLocalService.dynamicQuery();
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

		return _attractionWaterRequiredLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterRequiredModelImpl</code>.
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

		return _attractionWaterRequiredLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterRequiredModelImpl</code>.
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

		return _attractionWaterRequiredLocalService.dynamicQuery(
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

		return _attractionWaterRequiredLocalService.dynamicQueryCount(
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

		return _attractionWaterRequiredLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterRequired
		fetchAttractionWaterRequired(long attractionWaterRequiredId) {

		return _attractionWaterRequiredLocalService.
			fetchAttractionWaterRequired(attractionWaterRequiredId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionWaterRequiredLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction water required with the primary key.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required
	 * @throws PortalException if a attraction water required with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterRequired
			getAttractionWaterRequired(long attractionWaterRequiredId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterRequiredLocalService.getAttractionWaterRequired(
			attractionWaterRequiredId);
	}

	/**
	 * Returns a range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @return the range of attraction water requireds
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionWaterRequired>
			getAttractionWaterRequireds(int start, int end) {

		return _attractionWaterRequiredLocalService.getAttractionWaterRequireds(
			start, end);
	}

	/**
	 * Returns the number of attraction water requireds.
	 *
	 * @return the number of attraction water requireds
	 */
	@Override
	public int getAttractionWaterRequiredsCount() {
		return _attractionWaterRequiredLocalService.
			getAttractionWaterRequiredsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionWaterRequiredLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterRequired
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterRequiredException {

		return _attractionWaterRequiredLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionWaterRequiredLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterRequiredLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction water required in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterRequiredLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterRequired the attraction water required
	 * @return the attraction water required that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterRequired
		updateAttractionWaterRequired(
			com.nbp.jtb.application.form.service.model.AttractionWaterRequired
				attractionWaterRequired) {

		return _attractionWaterRequiredLocalService.
			updateAttractionWaterRequired(attractionWaterRequired);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionWaterRequiredLocalService.getBasePersistence();
	}

	@Override
	public AttractionWaterRequiredLocalService getWrappedService() {
		return _attractionWaterRequiredLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionWaterRequiredLocalService
			attractionWaterRequiredLocalService) {

		_attractionWaterRequiredLocalService =
			attractionWaterRequiredLocalService;
	}

	private AttractionWaterRequiredLocalService
		_attractionWaterRequiredLocalService;

}