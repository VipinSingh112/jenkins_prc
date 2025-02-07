/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionCarRentalLicenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentalLicenceLocalService
 * @generated
 */
public class AttractionCarRentalLicenceLocalServiceWrapper
	implements AttractionCarRentalLicenceLocalService,
			   ServiceWrapper<AttractionCarRentalLicenceLocalService> {

	public AttractionCarRentalLicenceLocalServiceWrapper() {
		this(null);
	}

	public AttractionCarRentalLicenceLocalServiceWrapper(
		AttractionCarRentalLicenceLocalService
			attractionCarRentalLicenceLocalService) {

		_attractionCarRentalLicenceLocalService =
			attractionCarRentalLicenceLocalService;
	}

	/**
	 * Adds the attraction car rental licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentalLicence the attraction car rental licence
	 * @return the attraction car rental licence that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence
		addAttractionCarRentalLicence(
			com.nbp.jtb.application.form.service.model.
				AttractionCarRentalLicence attractionCarRentalLicence) {

		return _attractionCarRentalLicenceLocalService.
			addAttractionCarRentalLicence(attractionCarRentalLicence);
	}

	/**
	 * Creates a new attraction car rental licence with the primary key. Does not add the attraction car rental licence to the database.
	 *
	 * @param attractionCarRentalLicId the primary key for the new attraction car rental licence
	 * @return the new attraction car rental licence
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence
		createAttractionCarRentalLicence(long attractionCarRentalLicId) {

		return _attractionCarRentalLicenceLocalService.
			createAttractionCarRentalLicence(attractionCarRentalLicId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentalLicenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction car rental licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentalLicence the attraction car rental licence
	 * @return the attraction car rental licence that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence
		deleteAttractionCarRentalLicence(
			com.nbp.jtb.application.form.service.model.
				AttractionCarRentalLicence attractionCarRentalLicence) {

		return _attractionCarRentalLicenceLocalService.
			deleteAttractionCarRentalLicence(attractionCarRentalLicence);
	}

	/**
	 * Deletes the attraction car rental licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence that was removed
	 * @throws PortalException if a attraction car rental licence with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence
			deleteAttractionCarRentalLicence(long attractionCarRentalLicId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentalLicenceLocalService.
			deleteAttractionCarRentalLicence(attractionCarRentalLicId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentalLicenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionCarRentalLicenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionCarRentalLicenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionCarRentalLicenceLocalService.dynamicQuery();
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

		return _attractionCarRentalLicenceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentalLicenceModelImpl</code>.
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

		return _attractionCarRentalLicenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentalLicenceModelImpl</code>.
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

		return _attractionCarRentalLicenceLocalService.dynamicQuery(
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

		return _attractionCarRentalLicenceLocalService.dynamicQueryCount(
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

		return _attractionCarRentalLicenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence
		fetchAttractionCarRentalLicence(long attractionCarRentalLicId) {

		return _attractionCarRentalLicenceLocalService.
			fetchAttractionCarRentalLicence(attractionCarRentalLicId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionCarRentalLicenceLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction car rental licence with the primary key.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence
	 * @throws PortalException if a attraction car rental licence with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence
			getAttractionCarRentalLicence(long attractionCarRentalLicId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentalLicenceLocalService.
			getAttractionCarRentalLicence(attractionCarRentalLicId);
	}

	/**
	 * Returns a range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @return the range of attraction car rental licences
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence>
			getAttractionCarRentalLicences(int start, int end) {

		return _attractionCarRentalLicenceLocalService.
			getAttractionCarRentalLicences(start, end);
	}

	/**
	 * Returns the number of attraction car rental licences.
	 *
	 * @return the number of attraction car rental licences
	 */
	@Override
	public int getAttractionCarRentalLicencesCount() {
		return _attractionCarRentalLicenceLocalService.
			getAttractionCarRentalLicencesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionCarRentalLicenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentalLicenceException {

		return _attractionCarRentalLicenceLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionCarRentalLicenceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentalLicenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction car rental licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentalLicence the attraction car rental licence
	 * @return the attraction car rental licence that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence
		updateAttractionCarRentalLicence(
			com.nbp.jtb.application.form.service.model.
				AttractionCarRentalLicence attractionCarRentalLicence) {

		return _attractionCarRentalLicenceLocalService.
			updateAttractionCarRentalLicence(attractionCarRentalLicence);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionCarRentalLicenceLocalService.getBasePersistence();
	}

	@Override
	public AttractionCarRentalLicenceLocalService getWrappedService() {
		return _attractionCarRentalLicenceLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionCarRentalLicenceLocalService
			attractionCarRentalLicenceLocalService) {

		_attractionCarRentalLicenceLocalService =
			attractionCarRentalLicenceLocalService;
	}

	private AttractionCarRentalLicenceLocalService
		_attractionCarRentalLicenceLocalService;

}