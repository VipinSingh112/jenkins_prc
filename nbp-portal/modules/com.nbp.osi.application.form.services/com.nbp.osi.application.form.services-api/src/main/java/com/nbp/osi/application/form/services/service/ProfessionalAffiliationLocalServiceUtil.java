/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.ProfessionalAffiliation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ProfessionalAffiliation. This utility wraps
 * <code>com.nbp.osi.application.form.services.service.impl.ProfessionalAffiliationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProfessionalAffiliationLocalService
 * @generated
 */
public class ProfessionalAffiliationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.application.form.services.service.impl.ProfessionalAffiliationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the professional affiliation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessionalAffiliationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professionalAffiliation the professional affiliation
	 * @return the professional affiliation that was added
	 */
	public static ProfessionalAffiliation addProfessionalAffiliation(
		ProfessionalAffiliation professionalAffiliation) {

		return getService().addProfessionalAffiliation(professionalAffiliation);
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
	 * Creates a new professional affiliation with the primary key. Does not add the professional affiliation to the database.
	 *
	 * @param professionalAffiliationId the primary key for the new professional affiliation
	 * @return the new professional affiliation
	 */
	public static ProfessionalAffiliation createProfessionalAffiliation(
		long professionalAffiliationId) {

		return getService().createProfessionalAffiliation(
			professionalAffiliationId);
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
	 * Deletes the professional affiliation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessionalAffiliationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation that was removed
	 * @throws PortalException if a professional affiliation with the primary key could not be found
	 */
	public static ProfessionalAffiliation deleteProfessionalAffiliation(
			long professionalAffiliationId)
		throws PortalException {

		return getService().deleteProfessionalAffiliation(
			professionalAffiliationId);
	}

	/**
	 * Deletes the professional affiliation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessionalAffiliationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professionalAffiliation the professional affiliation
	 * @return the professional affiliation that was removed
	 */
	public static ProfessionalAffiliation deleteProfessionalAffiliation(
		ProfessionalAffiliation professionalAffiliation) {

		return getService().deleteProfessionalAffiliation(
			professionalAffiliation);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.ProfessionalAffiliationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.ProfessionalAffiliationModelImpl</code>.
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

	public static ProfessionalAffiliation fetchProfessionalAffiliation(
		long professionalAffiliationId) {

		return getService().fetchProfessionalAffiliation(
			professionalAffiliationId);
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

	public static ProfessionalAffiliation getOsiById(long applicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchProfessionalAffiliationException {

		return getService().getOsiById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the professional affiliation with the primary key.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation
	 * @throws PortalException if a professional affiliation with the primary key could not be found
	 */
	public static ProfessionalAffiliation getProfessionalAffiliation(
			long professionalAffiliationId)
		throws PortalException {

		return getService().getProfessionalAffiliation(
			professionalAffiliationId);
	}

	/**
	 * Returns a range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @return the range of professional affiliations
	 */
	public static List<ProfessionalAffiliation> getProfessionalAffiliations(
		int start, int end) {

		return getService().getProfessionalAffiliations(start, end);
	}

	/**
	 * Returns the number of professional affiliations.
	 *
	 * @return the number of professional affiliations
	 */
	public static int getProfessionalAffiliationsCount() {
		return getService().getProfessionalAffiliationsCount();
	}

	/**
	 * Updates the professional affiliation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessionalAffiliationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professionalAffiliation the professional affiliation
	 * @return the professional affiliation that was updated
	 */
	public static ProfessionalAffiliation updateProfessionalAffiliation(
		ProfessionalAffiliation professionalAffiliation) {

		return getService().updateProfessionalAffiliation(
			professionalAffiliation);
	}

	public static ProfessionalAffiliationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ProfessionalAffiliationLocalService>
		_serviceSnapshot = new Snapshot<>(
			ProfessionalAffiliationLocalServiceUtil.class,
			ProfessionalAffiliationLocalService.class);

}