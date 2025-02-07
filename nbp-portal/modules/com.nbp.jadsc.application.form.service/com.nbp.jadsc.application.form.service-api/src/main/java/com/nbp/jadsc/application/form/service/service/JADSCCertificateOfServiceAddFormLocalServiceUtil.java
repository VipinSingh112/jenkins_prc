/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JADSCCertificateOfServiceAddForm. This utility wraps
 * <code>com.nbp.jadsc.application.form.service.service.impl.JADSCCertificateOfServiceAddFormLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceAddFormLocalService
 * @generated
 */
public class JADSCCertificateOfServiceAddFormLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.application.form.service.service.impl.JADSCCertificateOfServiceAddFormLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc certificate of service add form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceAddFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfServiceAddForm the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was added
	 */
	public static JADSCCertificateOfServiceAddForm
		addJADSCCertificateOfServiceAddForm(
			JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		return getService().addJADSCCertificateOfServiceAddForm(
			jadscCertificateOfServiceAddForm);
	}

	/**
	 * Creates a new jadsc certificate of service add form with the primary key. Does not add the jadsc certificate of service add form to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service add form
	 * @return the new jadsc certificate of service add form
	 */
	public static JADSCCertificateOfServiceAddForm
		createJADSCCertificateOfServiceAddForm(long jadscCOSId) {

		return getService().createJADSCCertificateOfServiceAddForm(jadscCOSId);
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
	 * Deletes the jadsc certificate of service add form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceAddFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfServiceAddForm the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was removed
	 */
	public static JADSCCertificateOfServiceAddForm
		deleteJADSCCertificateOfServiceAddForm(
			JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		return getService().deleteJADSCCertificateOfServiceAddForm(
			jadscCertificateOfServiceAddForm);
	}

	/**
	 * Deletes the jadsc certificate of service add form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceAddFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was removed
	 * @throws PortalException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public static JADSCCertificateOfServiceAddForm
			deleteJADSCCertificateOfServiceAddForm(long jadscCOSId)
		throws PortalException {

		return getService().deleteJADSCCertificateOfServiceAddForm(jadscCOSId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormModelImpl</code>.
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

	public static JADSCCertificateOfServiceAddForm
		fetchJADSCCertificateOfServiceAddForm(long jadscCOSId) {

		return getService().fetchJADSCCertificateOfServiceAddForm(jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service add form matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of service add form's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm
		fetchJADSCCertificateOfServiceAddFormByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchJADSCCertificateOfServiceAddFormByUuidAndGroupId(
				uuid, groupId);
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

	/**
	 * Returns the jadsc certificate of service add form with the primary key.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form
	 * @throws PortalException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public static JADSCCertificateOfServiceAddForm
			getJADSCCertificateOfServiceAddForm(long jadscCOSId)
		throws PortalException {

		return getService().getJADSCCertificateOfServiceAddForm(jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service add form matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of service add form's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of service add form
	 * @throws PortalException if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm
			getJADSCCertificateOfServiceAddFormByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getJADSCCertificateOfServiceAddFormByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm>
		getJADSCCertificateOfServiceAddForms(int start, int end) {

		return getService().getJADSCCertificateOfServiceAddForms(start, end);
	}

	/**
	 * Returns all the jadsc certificate of service add forms matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of service add forms
	 * @param companyId the primary key of the company
	 * @return the matching jadsc certificate of service add forms, or an empty list if no matches were found
	 */
	public static List<JADSCCertificateOfServiceAddForm>
		getJADSCCertificateOfServiceAddFormsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getJADSCCertificateOfServiceAddFormsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of jadsc certificate of service add forms matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of service add forms
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc certificate of service add forms, or an empty list if no matches were found
	 */
	public static List<JADSCCertificateOfServiceAddForm>
		getJADSCCertificateOfServiceAddFormsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator) {

		return getService().
			getJADSCCertificateOfServiceAddFormsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc certificate of service add forms.
	 *
	 * @return the number of jadsc certificate of service add forms
	 */
	public static int getJADSCCertificateOfServiceAddFormsCount() {
		return getService().getJADSCCertificateOfServiceAddFormsCount();
	}

	public static List<JADSCCertificateOfServiceAddForm> getJADSCDataListBy_Id(
		long jadscApplicationId) {

		return getService().getJADSCDataListBy_Id(jadscApplicationId);
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
	 * Updates the jadsc certificate of service add form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceAddFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfServiceAddForm the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was updated
	 */
	public static JADSCCertificateOfServiceAddForm
		updateJADSCCertificateOfServiceAddForm(
			JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		return getService().updateJADSCCertificateOfServiceAddForm(
			jadscCertificateOfServiceAddForm);
	}

	public static JADSCCertificateOfServiceAddFormLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JADSCCertificateOfServiceAddFormLocalService>
		_serviceSnapshot = new Snapshot<>(
			JADSCCertificateOfServiceAddFormLocalServiceUtil.class,
			JADSCCertificateOfServiceAddFormLocalService.class);

}