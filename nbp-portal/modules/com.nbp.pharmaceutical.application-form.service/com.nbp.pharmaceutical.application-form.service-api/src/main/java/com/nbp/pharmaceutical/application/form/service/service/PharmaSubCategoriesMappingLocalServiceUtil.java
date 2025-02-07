/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaSubCategoriesMapping;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PharmaSubCategoriesMapping. This utility wraps
 * <code>com.nbp.pharmaceutical.application.form.service.service.impl.PharmaSubCategoriesMappingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaSubCategoriesMappingLocalService
 * @generated
 */
public class PharmaSubCategoriesMappingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.pharmaceutical.application.form.service.service.impl.PharmaSubCategoriesMappingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static PharmaSubCategoriesMapping addPharmaSubCategoriesMapping(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		return getService().addPharmaSubCategoriesMapping(
			pharmaSubCategoriesMapping);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new pharma sub categories mapping with the primary key. Does not add the pharma sub categories mapping to the database.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key for the new pharma sub categories mapping
	 * @return the new pharma sub categories mapping
	 */
	public static PharmaSubCategoriesMapping createPharmaSubCategoriesMapping(
		long pharmaSubCategoriesMappingId) {

		return getService().createPharmaSubCategoriesMapping(
			pharmaSubCategoriesMappingId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static PharmaSubCategoriesMapping deletePharmaSubCategoriesMapping(
			long pharmaSubCategoriesMappingId)
		throws PortalException {

		return getService().deletePharmaSubCategoriesMapping(
			pharmaSubCategoriesMappingId);
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
	public static PharmaSubCategoriesMapping deletePharmaSubCategoriesMapping(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		return getService().deletePharmaSubCategoriesMapping(
			pharmaSubCategoriesMapping);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static PharmaSubCategoriesMapping fetchPharmaSubCategoriesMapping(
		long pharmaSubCategoriesMappingId) {

		return getService().fetchPharmaSubCategoriesMapping(
			pharmaSubCategoriesMappingId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the pharma sub categories mapping with the primary key.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping
	 * @throws PortalException if a pharma sub categories mapping with the primary key could not be found
	 */
	public static PharmaSubCategoriesMapping getPharmaSubCategoriesMapping(
			long pharmaSubCategoriesMappingId)
		throws PortalException {

		return getService().getPharmaSubCategoriesMapping(
			pharmaSubCategoriesMappingId);
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
	public static List<PharmaSubCategoriesMapping>
		getPharmaSubCategoriesMappings(int start, int end) {

		return getService().getPharmaSubCategoriesMappings(start, end);
	}

	/**
	 * Returns the number of pharma sub categories mappings.
	 *
	 * @return the number of pharma sub categories mappings
	 */
	public static int getPharmaSubCategoriesMappingsCount() {
		return getService().getPharmaSubCategoriesMappingsCount();
	}

	public static List<PharmaSubCategoriesMapping> getPharmaSubCategory(
		String subCategory) {

		return getService().getPharmaSubCategory(subCategory);
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
	public static PharmaSubCategoriesMapping updatePharmaSubCategoriesMapping(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		return getService().updatePharmaSubCategoriesMapping(
			pharmaSubCategoriesMapping);
	}

	public static PharmaSubCategoriesMappingLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PharmaSubCategoriesMappingLocalService>
		_serviceSnapshot = new Snapshot<>(
			PharmaSubCategoriesMappingLocalServiceUtil.class,
			PharmaSubCategoriesMappingLocalService.class);

}