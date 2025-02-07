/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionTravelAgencyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelAgencyLocalService
 * @generated
 */
public class AttractionTravelAgencyLocalServiceWrapper
	implements AttractionTravelAgencyLocalService,
			   ServiceWrapper<AttractionTravelAgencyLocalService> {

	public AttractionTravelAgencyLocalServiceWrapper() {
		this(null);
	}

	public AttractionTravelAgencyLocalServiceWrapper(
		AttractionTravelAgencyLocalService attractionTravelAgencyLocalService) {

		_attractionTravelAgencyLocalService =
			attractionTravelAgencyLocalService;
	}

	/**
	 * Adds the attraction travel agency to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelAgencyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelAgency the attraction travel agency
	 * @return the attraction travel agency that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelAgency
		addAttractionTravelAgency(
			com.nbp.jtb.application.form.service.model.AttractionTravelAgency
				attractionTravelAgency) {

		return _attractionTravelAgencyLocalService.addAttractionTravelAgency(
			attractionTravelAgency);
	}

	/**
	 * Creates a new attraction travel agency with the primary key. Does not add the attraction travel agency to the database.
	 *
	 * @param attractionTravelAgencyId the primary key for the new attraction travel agency
	 * @return the new attraction travel agency
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelAgency
		createAttractionTravelAgency(long attractionTravelAgencyId) {

		return _attractionTravelAgencyLocalService.createAttractionTravelAgency(
			attractionTravelAgencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelAgencyLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction travel agency from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelAgencyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelAgency the attraction travel agency
	 * @return the attraction travel agency that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelAgency
		deleteAttractionTravelAgency(
			com.nbp.jtb.application.form.service.model.AttractionTravelAgency
				attractionTravelAgency) {

		return _attractionTravelAgencyLocalService.deleteAttractionTravelAgency(
			attractionTravelAgency);
	}

	/**
	 * Deletes the attraction travel agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelAgencyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency that was removed
	 * @throws PortalException if a attraction travel agency with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelAgency
			deleteAttractionTravelAgency(long attractionTravelAgencyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelAgencyLocalService.deleteAttractionTravelAgency(
			attractionTravelAgencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelAgencyLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionTravelAgencyLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionTravelAgencyLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionTravelAgencyLocalService.dynamicQuery();
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

		return _attractionTravelAgencyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyModelImpl</code>.
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

		return _attractionTravelAgencyLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyModelImpl</code>.
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

		return _attractionTravelAgencyLocalService.dynamicQuery(
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

		return _attractionTravelAgencyLocalService.dynamicQueryCount(
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

		return _attractionTravelAgencyLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelAgency
		fetchAttractionTravelAgency(long attractionTravelAgencyId) {

		return _attractionTravelAgencyLocalService.fetchAttractionTravelAgency(
			attractionTravelAgencyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionTravelAgencyLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @return the range of attraction travel agencies
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionTravelAgency>
			getAttractionTravelAgencies(int start, int end) {

		return _attractionTravelAgencyLocalService.getAttractionTravelAgencies(
			start, end);
	}

	/**
	 * Returns the number of attraction travel agencies.
	 *
	 * @return the number of attraction travel agencies
	 */
	@Override
	public int getAttractionTravelAgenciesCount() {
		return _attractionTravelAgencyLocalService.
			getAttractionTravelAgenciesCount();
	}

	/**
	 * Returns the attraction travel agency with the primary key.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency
	 * @throws PortalException if a attraction travel agency with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelAgency
			getAttractionTravelAgency(long attractionTravelAgencyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelAgencyLocalService.getAttractionTravelAgency(
			attractionTravelAgencyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionTravelAgencyLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelAgency
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelAgencyException {

		return _attractionTravelAgencyLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionTravelAgencyLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionTravelAgencyLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction travel agency in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelAgencyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelAgency the attraction travel agency
	 * @return the attraction travel agency that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionTravelAgency
		updateAttractionTravelAgency(
			com.nbp.jtb.application.form.service.model.AttractionTravelAgency
				attractionTravelAgency) {

		return _attractionTravelAgencyLocalService.updateAttractionTravelAgency(
			attractionTravelAgency);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionTravelAgencyLocalService.getBasePersistence();
	}

	@Override
	public AttractionTravelAgencyLocalService getWrappedService() {
		return _attractionTravelAgencyLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionTravelAgencyLocalService attractionTravelAgencyLocalService) {

		_attractionTravelAgencyLocalService =
			attractionTravelAgencyLocalService;
	}

	private AttractionTravelAgencyLocalService
		_attractionTravelAgencyLocalService;

}