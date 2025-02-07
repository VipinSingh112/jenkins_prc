/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AccoGenDeclaration;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccoGenDeclaration. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AccoGenDeclarationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccoGenDeclarationLocalService
 * @generated
 */
public class AccoGenDeclarationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AccoGenDeclarationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acco gen declaration to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 * @return the acco gen declaration that was added
	 */
	public static AccoGenDeclaration addAccoGenDeclaration(
		AccoGenDeclaration accoGenDeclaration) {

		return getService().addAccoGenDeclaration(accoGenDeclaration);
	}

	/**
	 * Creates a new acco gen declaration with the primary key. Does not add the acco gen declaration to the database.
	 *
	 * @param accoGenDeclarationId the primary key for the new acco gen declaration
	 * @return the new acco gen declaration
	 */
	public static AccoGenDeclaration createAccoGenDeclaration(
		long accoGenDeclarationId) {

		return getService().createAccoGenDeclaration(accoGenDeclarationId);
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
	 * Deletes the acco gen declaration from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 * @return the acco gen declaration that was removed
	 */
	public static AccoGenDeclaration deleteAccoGenDeclaration(
		AccoGenDeclaration accoGenDeclaration) {

		return getService().deleteAccoGenDeclaration(accoGenDeclaration);
	}

	/**
	 * Deletes the acco gen declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration that was removed
	 * @throws PortalException if a acco gen declaration with the primary key could not be found
	 */
	public static AccoGenDeclaration deleteAccoGenDeclaration(
			long accoGenDeclarationId)
		throws PortalException {

		return getService().deleteAccoGenDeclaration(accoGenDeclarationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl</code>.
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

	public static AccoGenDeclaration fetchAccoGenDeclaration(
		long accoGenDeclarationId) {

		return getService().fetchAccoGenDeclaration(accoGenDeclarationId);
	}

	/**
	 * Returns the acco gen declaration matching the UUID and group.
	 *
	 * @param uuid the acco gen declaration's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	public static AccoGenDeclaration fetchAccoGenDeclarationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAccoGenDeclarationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acco gen declaration with the primary key.
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration
	 * @throws PortalException if a acco gen declaration with the primary key could not be found
	 */
	public static AccoGenDeclaration getAccoGenDeclaration(
			long accoGenDeclarationId)
		throws PortalException {

		return getService().getAccoGenDeclaration(accoGenDeclarationId);
	}

	/**
	 * Returns the acco gen declaration matching the UUID and group.
	 *
	 * @param uuid the acco gen declaration's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco gen declaration
	 * @throws PortalException if a matching acco gen declaration could not be found
	 */
	public static AccoGenDeclaration getAccoGenDeclarationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAccoGenDeclarationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acco gen declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @return the range of acco gen declarations
	 */
	public static List<AccoGenDeclaration> getAccoGenDeclarations(
		int start, int end) {

		return getService().getAccoGenDeclarations(start, end);
	}

	/**
	 * Returns all the acco gen declarations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco gen declarations
	 * @param companyId the primary key of the company
	 * @return the matching acco gen declarations, or an empty list if no matches were found
	 */
	public static List<AccoGenDeclaration>
		getAccoGenDeclarationsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getAccoGenDeclarationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acco gen declarations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco gen declarations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco gen declarations, or an empty list if no matches were found
	 */
	public static List<AccoGenDeclaration>
		getAccoGenDeclarationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccoGenDeclaration> orderByComparator) {

		return getService().getAccoGenDeclarationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acco gen declarations.
	 *
	 * @return the number of acco gen declarations
	 */
	public static int getAccoGenDeclarationsCount() {
		return getService().getAccoGenDeclarationsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static AccoGenDeclaration getJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoGenDeclarationException {

		return getService().getJTB_ByApplicationId(jtbApplicationId);
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
	 * Updates the acco gen declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 * @return the acco gen declaration that was updated
	 */
	public static AccoGenDeclaration updateAccoGenDeclaration(
		AccoGenDeclaration accoGenDeclaration) {

		return getService().updateAccoGenDeclaration(accoGenDeclaration);
	}

	public static AccoGenDeclarationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccoGenDeclarationLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccoGenDeclarationLocalServiceUtil.class,
			AccoGenDeclarationLocalService.class);

}