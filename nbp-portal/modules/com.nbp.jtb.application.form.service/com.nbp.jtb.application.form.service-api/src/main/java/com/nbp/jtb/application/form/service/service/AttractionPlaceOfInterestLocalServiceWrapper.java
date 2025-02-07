/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionPlaceOfInterestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionPlaceOfInterestLocalService
 * @generated
 */
public class AttractionPlaceOfInterestLocalServiceWrapper
	implements AttractionPlaceOfInterestLocalService,
			   ServiceWrapper<AttractionPlaceOfInterestLocalService> {

	public AttractionPlaceOfInterestLocalServiceWrapper() {
		this(null);
	}

	public AttractionPlaceOfInterestLocalServiceWrapper(
		AttractionPlaceOfInterestLocalService
			attractionPlaceOfInterestLocalService) {

		_attractionPlaceOfInterestLocalService =
			attractionPlaceOfInterestLocalService;
	}

	/**
	 * Adds the attraction place of interest to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionPlaceOfInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionPlaceOfInterest the attraction place of interest
	 * @return the attraction place of interest that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
		addAttractionPlaceOfInterest(
			com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
				attractionPlaceOfInterest) {

		return _attractionPlaceOfInterestLocalService.
			addAttractionPlaceOfInterest(attractionPlaceOfInterest);
	}

	/**
	 * Creates a new attraction place of interest with the primary key. Does not add the attraction place of interest to the database.
	 *
	 * @param attractionPlaceOfInterestId the primary key for the new attraction place of interest
	 * @return the new attraction place of interest
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
		createAttractionPlaceOfInterest(long attractionPlaceOfInterestId) {

		return _attractionPlaceOfInterestLocalService.
			createAttractionPlaceOfInterest(attractionPlaceOfInterestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionPlaceOfInterestLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction place of interest from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionPlaceOfInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionPlaceOfInterest the attraction place of interest
	 * @return the attraction place of interest that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
		deleteAttractionPlaceOfInterest(
			com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
				attractionPlaceOfInterest) {

		return _attractionPlaceOfInterestLocalService.
			deleteAttractionPlaceOfInterest(attractionPlaceOfInterest);
	}

	/**
	 * Deletes the attraction place of interest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionPlaceOfInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest that was removed
	 * @throws PortalException if a attraction place of interest with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
			deleteAttractionPlaceOfInterest(long attractionPlaceOfInterestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionPlaceOfInterestLocalService.
			deleteAttractionPlaceOfInterest(attractionPlaceOfInterestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionPlaceOfInterestLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionPlaceOfInterestLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionPlaceOfInterestLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionPlaceOfInterestLocalService.dynamicQuery();
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

		return _attractionPlaceOfInterestLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionPlaceOfInterestModelImpl</code>.
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

		return _attractionPlaceOfInterestLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionPlaceOfInterestModelImpl</code>.
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

		return _attractionPlaceOfInterestLocalService.dynamicQuery(
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

		return _attractionPlaceOfInterestLocalService.dynamicQueryCount(
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

		return _attractionPlaceOfInterestLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
		fetchAttractionPlaceOfInterest(long attractionPlaceOfInterestId) {

		return _attractionPlaceOfInterestLocalService.
			fetchAttractionPlaceOfInterest(attractionPlaceOfInterestId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionPlaceOfInterestLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction place of interest with the primary key.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest
	 * @throws PortalException if a attraction place of interest with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
			getAttractionPlaceOfInterest(long attractionPlaceOfInterestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionPlaceOfInterestLocalService.
			getAttractionPlaceOfInterest(attractionPlaceOfInterestId);
	}

	/**
	 * Returns a range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @return the range of attraction place of interests
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest>
			getAttractionPlaceOfInterests(int start, int end) {

		return _attractionPlaceOfInterestLocalService.
			getAttractionPlaceOfInterests(start, end);
	}

	/**
	 * Returns the number of attraction place of interests.
	 *
	 * @return the number of attraction place of interests
	 */
	@Override
	public int getAttractionPlaceOfInterestsCount() {
		return _attractionPlaceOfInterestLocalService.
			getAttractionPlaceOfInterestsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionPlaceOfInterestLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionPlaceOfInterestException {

		return _attractionPlaceOfInterestLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionPlaceOfInterestLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionPlaceOfInterestLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction place of interest in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionPlaceOfInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionPlaceOfInterest the attraction place of interest
	 * @return the attraction place of interest that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
		updateAttractionPlaceOfInterest(
			com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest
				attractionPlaceOfInterest) {

		return _attractionPlaceOfInterestLocalService.
			updateAttractionPlaceOfInterest(attractionPlaceOfInterest);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionPlaceOfInterestLocalService.getBasePersistence();
	}

	@Override
	public AttractionPlaceOfInterestLocalService getWrappedService() {
		return _attractionPlaceOfInterestLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionPlaceOfInterestLocalService
			attractionPlaceOfInterestLocalService) {

		_attractionPlaceOfInterestLocalService =
			attractionPlaceOfInterestLocalService;
	}

	private AttractionPlaceOfInterestLocalService
		_attractionPlaceOfInterestLocalService;

}