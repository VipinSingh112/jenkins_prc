/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaSubCategoriesMappingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaSubCategoriesMappingLocalService
 * @generated
 */
public class PharmaSubCategoriesMappingLocalServiceWrapper
	implements PharmaSubCategoriesMappingLocalService,
			   ServiceWrapper<PharmaSubCategoriesMappingLocalService> {

	public PharmaSubCategoriesMappingLocalServiceWrapper() {
		this(null);
	}

	public PharmaSubCategoriesMappingLocalServiceWrapper(
		PharmaSubCategoriesMappingLocalService
			pharmaSubCategoriesMappingLocalService) {

		_pharmaSubCategoriesMappingLocalService =
			pharmaSubCategoriesMappingLocalService;
	}

	/**
	 * Adds the pharma sub categories mapping to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaSubCategoriesMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaSubCategoriesMapping the pharma sub categories mapping
	 * @return the pharma sub categories mapping that was added
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaSubCategoriesMapping addPharmaSubCategoriesMapping(
			com.nbp.pharmaceutical.application.form.service.model.
				PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		return _pharmaSubCategoriesMappingLocalService.
			addPharmaSubCategoriesMapping(pharmaSubCategoriesMapping);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaSubCategoriesMappingLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma sub categories mapping with the primary key. Does not add the pharma sub categories mapping to the database.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key for the new pharma sub categories mapping
	 * @return the new pharma sub categories mapping
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaSubCategoriesMapping createPharmaSubCategoriesMapping(
			long pharmaSubCategoriesMappingId) {

		return _pharmaSubCategoriesMappingLocalService.
			createPharmaSubCategoriesMapping(pharmaSubCategoriesMappingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaSubCategoriesMappingLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma sub categories mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaSubCategoriesMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping that was removed
	 * @throws PortalException if a pharma sub categories mapping with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaSubCategoriesMapping deletePharmaSubCategoriesMapping(
				long pharmaSubCategoriesMappingId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaSubCategoriesMappingLocalService.
			deletePharmaSubCategoriesMapping(pharmaSubCategoriesMappingId);
	}

	/**
	 * Deletes the pharma sub categories mapping from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaSubCategoriesMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaSubCategoriesMapping the pharma sub categories mapping
	 * @return the pharma sub categories mapping that was removed
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaSubCategoriesMapping deletePharmaSubCategoriesMapping(
			com.nbp.pharmaceutical.application.form.service.model.
				PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		return _pharmaSubCategoriesMappingLocalService.
			deletePharmaSubCategoriesMapping(pharmaSubCategoriesMapping);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaSubCategoriesMappingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaSubCategoriesMappingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaSubCategoriesMappingLocalService.dynamicQuery();
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

		return _pharmaSubCategoriesMappingLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaSubCategoriesMappingModelImpl</code>.
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

		return _pharmaSubCategoriesMappingLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaSubCategoriesMappingModelImpl</code>.
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

		return _pharmaSubCategoriesMappingLocalService.dynamicQuery(
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

		return _pharmaSubCategoriesMappingLocalService.dynamicQueryCount(
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

		return _pharmaSubCategoriesMappingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaSubCategoriesMapping fetchPharmaSubCategoriesMapping(
			long pharmaSubCategoriesMappingId) {

		return _pharmaSubCategoriesMappingLocalService.
			fetchPharmaSubCategoriesMapping(pharmaSubCategoriesMappingId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaSubCategoriesMappingLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaSubCategoriesMappingLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaSubCategoriesMappingLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaSubCategoriesMappingLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the pharma sub categories mapping with the primary key.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping
	 * @throws PortalException if a pharma sub categories mapping with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaSubCategoriesMapping getPharmaSubCategoriesMapping(
				long pharmaSubCategoriesMappingId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaSubCategoriesMappingLocalService.
			getPharmaSubCategoriesMapping(pharmaSubCategoriesMappingId);
	}

	/**
	 * Returns a range of all the pharma sub categories mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @return the range of pharma sub categories mappings
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaSubCategoriesMapping> getPharmaSubCategoriesMappings(
				int start, int end) {

		return _pharmaSubCategoriesMappingLocalService.
			getPharmaSubCategoriesMappings(start, end);
	}

	/**
	 * Returns the number of pharma sub categories mappings.
	 *
	 * @return the number of pharma sub categories mappings
	 */
	@Override
	public int getPharmaSubCategoriesMappingsCount() {
		return _pharmaSubCategoriesMappingLocalService.
			getPharmaSubCategoriesMappingsCount();
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaSubCategoriesMapping> getPharmaSubCategory(
				String subCategory) {

		return _pharmaSubCategoriesMappingLocalService.getPharmaSubCategory(
			subCategory);
	}

	/**
	 * Updates the pharma sub categories mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaSubCategoriesMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaSubCategoriesMapping the pharma sub categories mapping
	 * @return the pharma sub categories mapping that was updated
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.
		PharmaSubCategoriesMapping updatePharmaSubCategoriesMapping(
			com.nbp.pharmaceutical.application.form.service.model.
				PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		return _pharmaSubCategoriesMappingLocalService.
			updatePharmaSubCategoriesMapping(pharmaSubCategoriesMapping);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaSubCategoriesMappingLocalService.getBasePersistence();
	}

	@Override
	public PharmaSubCategoriesMappingLocalService getWrappedService() {
		return _pharmaSubCategoriesMappingLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaSubCategoriesMappingLocalService
			pharmaSubCategoriesMappingLocalService) {

		_pharmaSubCategoriesMappingLocalService =
			pharmaSubCategoriesMappingLocalService;
	}

	private PharmaSubCategoriesMappingLocalService
		_pharmaSubCategoriesMappingLocalService;

}