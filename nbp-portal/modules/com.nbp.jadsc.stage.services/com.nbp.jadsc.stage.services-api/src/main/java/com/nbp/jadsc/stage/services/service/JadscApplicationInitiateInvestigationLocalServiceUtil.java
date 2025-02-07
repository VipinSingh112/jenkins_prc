/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JadscApplicationInitiateInvestigation. This utility wraps
 * <code>com.nbp.jadsc.stage.services.service.impl.JadscApplicationInitiateInvestigationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationInitiateInvestigationLocalService
 * @generated
 */
public class JadscApplicationInitiateInvestigationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.stage.services.service.impl.JadscApplicationInitiateInvestigationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc application initiate investigation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationInitiateInvestigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationInitiateInvestigation the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was added
	 */
	public static JadscApplicationInitiateInvestigation
		addJadscApplicationInitiateInvestigation(
			JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation) {

		return getService().addJadscApplicationInitiateInvestigation(
			jadscApplicationInitiateInvestigation);
	}

	/**
	 * Creates a new jadsc application initiate investigation with the primary key. Does not add the jadsc application initiate investigation to the database.
	 *
	 * @param jadscAppliInvestiId the primary key for the new jadsc application initiate investigation
	 * @return the new jadsc application initiate investigation
	 */
	public static JadscApplicationInitiateInvestigation
		createJadscApplicationInitiateInvestigation(long jadscAppliInvestiId) {

		return getService().createJadscApplicationInitiateInvestigation(
			jadscAppliInvestiId);
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
	 * Deletes the jadsc application initiate investigation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationInitiateInvestigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationInitiateInvestigation the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was removed
	 */
	public static JadscApplicationInitiateInvestigation
		deleteJadscApplicationInitiateInvestigation(
			JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation) {

		return getService().deleteJadscApplicationInitiateInvestigation(
			jadscApplicationInitiateInvestigation);
	}

	/**
	 * Deletes the jadsc application initiate investigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationInitiateInvestigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was removed
	 * @throws PortalException if a jadsc application initiate investigation with the primary key could not be found
	 */
	public static JadscApplicationInitiateInvestigation
			deleteJadscApplicationInitiateInvestigation(
				long jadscAppliInvestiId)
		throws PortalException {

		return getService().deleteJadscApplicationInitiateInvestigation(
			jadscAppliInvestiId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationInitiateInvestigationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationInitiateInvestigationModelImpl</code>.
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

	public static JadscApplicationInitiateInvestigation
		fetchJadscApplicationInitiateInvestigation(long jadscAppliInvestiId) {

		return getService().fetchJadscApplicationInitiateInvestigation(
			jadscAppliInvestiId);
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
	 * Returns the jadsc application initiate investigation with the primary key.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation
	 * @throws PortalException if a jadsc application initiate investigation with the primary key could not be found
	 */
	public static JadscApplicationInitiateInvestigation
			getJadscApplicationInitiateInvestigation(long jadscAppliInvestiId)
		throws PortalException {

		return getService().getJadscApplicationInitiateInvestigation(
			jadscAppliInvestiId);
	}

	public static List<JadscApplicationInitiateInvestigation>
		getJadscApplicationInitiateInvestigationBy_List_CI(String outcome) {

		return getService().getJadscApplicationInitiateInvestigationBy_List_CI(
			outcome);
	}

	public static JadscApplicationInitiateInvestigation
			getJadscApplicationInitiateInvestigationByCI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationInitiateInvestigationException {

		return getService().getJadscApplicationInitiateInvestigationByCI(
			caseId);
	}

	/**
	 * Returns a range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @return the range of jadsc application initiate investigations
	 */
	public static List<JadscApplicationInitiateInvestigation>
		getJadscApplicationInitiateInvestigations(int start, int end) {

		return getService().getJadscApplicationInitiateInvestigations(
			start, end);
	}

	/**
	 * Returns the number of jadsc application initiate investigations.
	 *
	 * @return the number of jadsc application initiate investigations
	 */
	public static int getJadscApplicationInitiateInvestigationsCount() {
		return getService().getJadscApplicationInitiateInvestigationsCount();
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
	 * Updates the jadsc application initiate investigation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationInitiateInvestigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationInitiateInvestigation the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was updated
	 */
	public static JadscApplicationInitiateInvestigation
		updateJadscApplicationInitiateInvestigation(
			JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation) {

		return getService().updateJadscApplicationInitiateInvestigation(
			jadscApplicationInitiateInvestigation);
	}

	public static JadscApplicationInitiateInvestigation
		updateJadscApplicationInitiateInvestigation(
			String caseId, java.util.Date dateOfInitiationInvestrigation,
			String outcome) {

		return getService().updateJadscApplicationInitiateInvestigation(
			caseId, dateOfInitiationInvestrigation, outcome);
	}

	public static JadscApplicationInitiateInvestigationLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<JadscApplicationInitiateInvestigationLocalService> _serviceSnapshot =
			new Snapshot<>(
				JadscApplicationInitiateInvestigationLocalServiceUtil.class,
				JadscApplicationInitiateInvestigationLocalService.class);

}