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

import com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JadscAppliPreliminationDete. This utility wraps
 * <code>com.nbp.jadsc.stage.services.service.impl.JadscAppliPreliminationDeteLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreliminationDeteLocalService
 * @generated
 */
public class JadscAppliPreliminationDeteLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.stage.services.service.impl.JadscAppliPreliminationDeteLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc appli prelimination dete to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreliminationDeteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreliminationDete the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was added
	 */
	public static JadscAppliPreliminationDete addJadscAppliPreliminationDete(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		return getService().addJadscAppliPreliminationDete(
			jadscAppliPreliminationDete);
	}

	/**
	 * Creates a new jadsc appli prelimination dete with the primary key. Does not add the jadsc appli prelimination dete to the database.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key for the new jadsc appli prelimination dete
	 * @return the new jadsc appli prelimination dete
	 */
	public static JadscAppliPreliminationDete createJadscAppliPreliminationDete(
		long jadscAppliPreliminationDeteId) {

		return getService().createJadscAppliPreliminationDete(
			jadscAppliPreliminationDeteId);
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
	 * Deletes the jadsc appli prelimination dete from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreliminationDeteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreliminationDete the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was removed
	 */
	public static JadscAppliPreliminationDete deleteJadscAppliPreliminationDete(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		return getService().deleteJadscAppliPreliminationDete(
			jadscAppliPreliminationDete);
	}

	/**
	 * Deletes the jadsc appli prelimination dete with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreliminationDeteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was removed
	 * @throws PortalException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public static JadscAppliPreliminationDete deleteJadscAppliPreliminationDete(
			long jadscAppliPreliminationDeteId)
		throws PortalException {

		return getService().deleteJadscAppliPreliminationDete(
			jadscAppliPreliminationDeteId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteModelImpl</code>.
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

	public static JadscAppliPreliminationDete fetchJadscAppliPreliminationDete(
		long jadscAppliPreliminationDeteId) {

		return getService().fetchJadscAppliPreliminationDete(
			jadscAppliPreliminationDeteId);
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
	 * Returns the jadsc appli prelimination dete with the primary key.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete
	 * @throws PortalException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public static JadscAppliPreliminationDete getJadscAppliPreliminationDete(
			long jadscAppliPreliminationDeteId)
		throws PortalException {

		return getService().getJadscAppliPreliminationDete(
			jadscAppliPreliminationDeteId);
	}

	public static JadscAppliPreliminationDete
			getJadscAppliPreliminationDeteByCI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreliminationDeteException {

		return getService().getJadscAppliPreliminationDeteByCI(caseId);
	}

	public static List<JadscAppliPreliminationDete>
		getJadscAppliPreliminationDeteByOutcome(String outcome) {

		return getService().getJadscAppliPreliminationDeteByOutcome(outcome);
	}

	/**
	 * Returns a range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @return the range of jadsc appli prelimination detes
	 */
	public static List<JadscAppliPreliminationDete>
		getJadscAppliPreliminationDetes(int start, int end) {

		return getService().getJadscAppliPreliminationDetes(start, end);
	}

	/**
	 * Returns the number of jadsc appli prelimination detes.
	 *
	 * @return the number of jadsc appli prelimination detes
	 */
	public static int getJadscAppliPreliminationDetesCount() {
		return getService().getJadscAppliPreliminationDetesCount();
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
	 * Updates the jadsc appli prelimination dete in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreliminationDeteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreliminationDete the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was updated
	 */
	public static JadscAppliPreliminationDete updateJadscAppliPreliminationDete(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		return getService().updateJadscAppliPreliminationDete(
			jadscAppliPreliminationDete);
	}

	public static JadscAppliPreliminationDete updateJadscAppliPreliminationDete(
		String caseId, java.util.Date dateOfPreDete, String outcome) {

		return getService().updateJadscAppliPreliminationDete(
			caseId, dateOfPreDete, outcome);
	}

	public static JadscAppliPreliminationDeteLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JadscAppliPreliminationDeteLocalService>
		_serviceSnapshot = new Snapshot<>(
			JadscAppliPreliminationDeteLocalServiceUtil.class,
			JadscAppliPreliminationDeteLocalService.class);

}