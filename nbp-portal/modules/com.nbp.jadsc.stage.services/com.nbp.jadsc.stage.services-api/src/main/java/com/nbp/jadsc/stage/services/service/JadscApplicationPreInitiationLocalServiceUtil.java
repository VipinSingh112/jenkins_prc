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

import com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JadscApplicationPreInitiation. This utility wraps
 * <code>com.nbp.jadsc.stage.services.service.impl.JadscApplicationPreInitiationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationPreInitiationLocalService
 * @generated
 */
public class JadscApplicationPreInitiationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.stage.services.service.impl.JadscApplicationPreInitiationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc application pre initiation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationPreInitiation the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was added
	 */
	public static JadscApplicationPreInitiation
		addJadscApplicationPreInitiation(
			JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		return getService().addJadscApplicationPreInitiation(
			jadscApplicationPreInitiation);
	}

	/**
	 * Creates a new jadsc application pre initiation with the primary key. Does not add the jadsc application pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc application pre initiation
	 * @return the new jadsc application pre initiation
	 */
	public static JadscApplicationPreInitiation
		createJadscApplicationPreInitiation(long jadscAppliPreInitiationId) {

		return getService().createJadscApplicationPreInitiation(
			jadscAppliPreInitiationId);
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
	 * Deletes the jadsc application pre initiation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationPreInitiation the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was removed
	 */
	public static JadscApplicationPreInitiation
		deleteJadscApplicationPreInitiation(
			JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		return getService().deleteJadscApplicationPreInitiation(
			jadscApplicationPreInitiation);
	}

	/**
	 * Deletes the jadsc application pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was removed
	 * @throws PortalException if a jadsc application pre initiation with the primary key could not be found
	 */
	public static JadscApplicationPreInitiation
			deleteJadscApplicationPreInitiation(long jadscAppliPreInitiationId)
		throws PortalException {

		return getService().deleteJadscApplicationPreInitiation(
			jadscAppliPreInitiationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationPreInitiationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationPreInitiationModelImpl</code>.
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

	public static JadscApplicationPreInitiation
		fetchJadscApplicationPreInitiation(long jadscAppliPreInitiationId) {

		return getService().fetchJadscApplicationPreInitiation(
			jadscAppliPreInitiationId);
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
	 * Returns the jadsc application pre initiation with the primary key.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation
	 * @throws PortalException if a jadsc application pre initiation with the primary key could not be found
	 */
	public static JadscApplicationPreInitiation
			getJadscApplicationPreInitiation(long jadscAppliPreInitiationId)
		throws PortalException {

		return getService().getJadscApplicationPreInitiation(
			jadscAppliPreInitiationId);
	}

	/**
	 * Returns a range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @return the range of jadsc application pre initiations
	 */
	public static List<JadscApplicationPreInitiation>
		getJadscApplicationPreInitiations(int start, int end) {

		return getService().getJadscApplicationPreInitiations(start, end);
	}

	/**
	 * Returns the number of jadsc application pre initiations.
	 *
	 * @return the number of jadsc application pre initiations
	 */
	public static int getJadscApplicationPreInitiationsCount() {
		return getService().getJadscApplicationPreInitiationsCount();
	}

	public static JadscApplicationPreInitiation getJadscPreInitiationByCI(
			String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationPreInitiationException {

		return getService().getJadscPreInitiationByCI(caseId);
	}

	public static List<JadscApplicationPreInitiation>
		getJadscPreInitiationByOutcome(String outcome) {

		return getService().getJadscPreInitiationByOutcome(outcome);
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
	 * Updates the jadsc application pre initiation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationPreInitiation the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was updated
	 */
	public static JadscApplicationPreInitiation
		updateJadscApplicationPreInitiation(
			JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		return getService().updateJadscApplicationPreInitiation(
			jadscApplicationPreInitiation);
	}

	public static JadscApplicationPreInitiation
		updateJadscApplicationPreInitiation(
			String caseId, java.util.Date dateOfPreInitiation, String outcome) {

		return getService().updateJadscApplicationPreInitiation(
			caseId, dateOfPreInitiation, outcome);
	}

	public static JadscApplicationPreInitiationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JadscApplicationPreInitiationLocalService>
		_serviceSnapshot = new Snapshot<>(
			JadscApplicationPreInitiationLocalServiceUtil.class,
			JadscApplicationPreInitiationLocalService.class);

}