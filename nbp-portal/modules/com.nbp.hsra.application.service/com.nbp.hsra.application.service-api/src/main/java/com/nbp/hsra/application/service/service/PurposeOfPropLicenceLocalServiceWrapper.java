/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PurposeOfPropLicenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PurposeOfPropLicenceLocalService
 * @generated
 */
public class PurposeOfPropLicenceLocalServiceWrapper
	implements PurposeOfPropLicenceLocalService,
			   ServiceWrapper<PurposeOfPropLicenceLocalService> {

	public PurposeOfPropLicenceLocalServiceWrapper() {
		this(null);
	}

	public PurposeOfPropLicenceLocalServiceWrapper(
		PurposeOfPropLicenceLocalService purposeOfPropLicenceLocalService) {

		_purposeOfPropLicenceLocalService = purposeOfPropLicenceLocalService;
	}

	/**
	 * Adds the purpose of prop licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PurposeOfPropLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param purposeOfPropLicence the purpose of prop licence
	 * @return the purpose of prop licence that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.PurposeOfPropLicence
		addPurposeOfPropLicence(
			com.nbp.hsra.application.service.model.PurposeOfPropLicence
				purposeOfPropLicence) {

		return _purposeOfPropLicenceLocalService.addPurposeOfPropLicence(
			purposeOfPropLicence);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _purposeOfPropLicenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new purpose of prop licence with the primary key. Does not add the purpose of prop licence to the database.
	 *
	 * @param purposeOfPropLicenceId the primary key for the new purpose of prop licence
	 * @return the new purpose of prop licence
	 */
	@Override
	public com.nbp.hsra.application.service.model.PurposeOfPropLicence
		createPurposeOfPropLicence(long purposeOfPropLicenceId) {

		return _purposeOfPropLicenceLocalService.createPurposeOfPropLicence(
			purposeOfPropLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _purposeOfPropLicenceLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the purpose of prop licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PurposeOfPropLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence that was removed
	 * @throws PortalException if a purpose of prop licence with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.PurposeOfPropLicence
			deletePurposeOfPropLicence(long purposeOfPropLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _purposeOfPropLicenceLocalService.deletePurposeOfPropLicence(
			purposeOfPropLicenceId);
	}

	/**
	 * Deletes the purpose of prop licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PurposeOfPropLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param purposeOfPropLicence the purpose of prop licence
	 * @return the purpose of prop licence that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.PurposeOfPropLicence
		deletePurposeOfPropLicence(
			com.nbp.hsra.application.service.model.PurposeOfPropLicence
				purposeOfPropLicence) {

		return _purposeOfPropLicenceLocalService.deletePurposeOfPropLicence(
			purposeOfPropLicence);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _purposeOfPropLicenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _purposeOfPropLicenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _purposeOfPropLicenceLocalService.dynamicQuery();
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

		return _purposeOfPropLicenceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.PurposeOfPropLicenceModelImpl</code>.
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

		return _purposeOfPropLicenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.PurposeOfPropLicenceModelImpl</code>.
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

		return _purposeOfPropLicenceLocalService.dynamicQuery(
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

		return _purposeOfPropLicenceLocalService.dynamicQueryCount(
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

		return _purposeOfPropLicenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.PurposeOfPropLicence
		fetchPurposeOfPropLicence(long purposeOfPropLicenceId) {

		return _purposeOfPropLicenceLocalService.fetchPurposeOfPropLicence(
			purposeOfPropLicenceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _purposeOfPropLicenceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.PurposeOfPropLicence
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchPurposeOfPropLicenceException {

		return _purposeOfPropLicenceLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _purposeOfPropLicenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _purposeOfPropLicenceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _purposeOfPropLicenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the purpose of prop licence with the primary key.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence
	 * @throws PortalException if a purpose of prop licence with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.PurposeOfPropLicence
			getPurposeOfPropLicence(long purposeOfPropLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _purposeOfPropLicenceLocalService.getPurposeOfPropLicence(
			purposeOfPropLicenceId);
	}

	/**
	 * Returns a range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @return the range of purpose of prop licences
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.PurposeOfPropLicence>
			getPurposeOfPropLicences(int start, int end) {

		return _purposeOfPropLicenceLocalService.getPurposeOfPropLicences(
			start, end);
	}

	/**
	 * Returns the number of purpose of prop licences.
	 *
	 * @return the number of purpose of prop licences
	 */
	@Override
	public int getPurposeOfPropLicencesCount() {
		return _purposeOfPropLicenceLocalService.
			getPurposeOfPropLicencesCount();
	}

	/**
	 * Updates the purpose of prop licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PurposeOfPropLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param purposeOfPropLicence the purpose of prop licence
	 * @return the purpose of prop licence that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.PurposeOfPropLicence
		updatePurposeOfPropLicence(
			com.nbp.hsra.application.service.model.PurposeOfPropLicence
				purposeOfPropLicence) {

		return _purposeOfPropLicenceLocalService.updatePurposeOfPropLicence(
			purposeOfPropLicence);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _purposeOfPropLicenceLocalService.getBasePersistence();
	}

	@Override
	public PurposeOfPropLicenceLocalService getWrappedService() {
		return _purposeOfPropLicenceLocalService;
	}

	@Override
	public void setWrappedService(
		PurposeOfPropLicenceLocalService purposeOfPropLicenceLocalService) {

		_purposeOfPropLicenceLocalService = purposeOfPropLicenceLocalService;
	}

	private PurposeOfPropLicenceLocalService _purposeOfPropLicenceLocalService;

}