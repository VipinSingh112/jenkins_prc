/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireExecution;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquireExecution. This utility wraps
 * <code>com.nbp.acquire.stages.service.service.impl.AcquireExecutionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireExecutionLocalService
 * @generated
 */
public class AcquireExecutionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.stages.service.service.impl.AcquireExecutionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire execution to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireExecutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireExecution the acquire execution
	 * @return the acquire execution that was added
	 */
	public static AcquireExecution addAcquireExecution(
		AcquireExecution acquireExecution) {

		return getService().addAcquireExecution(acquireExecution);
	}

	/**
	 * Creates a new acquire execution with the primary key. Does not add the acquire execution to the database.
	 *
	 * @param acquireExecutionId the primary key for the new acquire execution
	 * @return the new acquire execution
	 */
	public static AcquireExecution createAcquireExecution(
		long acquireExecutionId) {

		return getService().createAcquireExecution(acquireExecutionId);
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
	 * Deletes the acquire execution from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireExecutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireExecution the acquire execution
	 * @return the acquire execution that was removed
	 */
	public static AcquireExecution deleteAcquireExecution(
		AcquireExecution acquireExecution) {

		return getService().deleteAcquireExecution(acquireExecution);
	}

	/**
	 * Deletes the acquire execution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireExecutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution that was removed
	 * @throws PortalException if a acquire execution with the primary key could not be found
	 */
	public static AcquireExecution deleteAcquireExecution(
			long acquireExecutionId)
		throws PortalException {

		return getService().deleteAcquireExecution(acquireExecutionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireExecutionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireExecutionModelImpl</code>.
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

	public static AcquireExecution fetchAcquireExecution(
		long acquireExecutionId) {

		return getService().fetchAcquireExecution(acquireExecutionId);
	}

	/**
	 * Returns the acquire execution with the primary key.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution
	 * @throws PortalException if a acquire execution with the primary key could not be found
	 */
	public static AcquireExecution getAcquireExecution(long acquireExecutionId)
		throws PortalException {

		return getService().getAcquireExecution(acquireExecutionId);
	}

	public static AcquireExecution getAcquireExecutionBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireExecutionException {

		return getService().getAcquireExecutionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @return the range of acquire executions
	 */
	public static List<AcquireExecution> getAcquireExecutions(
		int start, int end) {

		return getService().getAcquireExecutions(start, end);
	}

	/**
	 * Returns the number of acquire executions.
	 *
	 * @return the number of acquire executions
	 */
	public static int getAcquireExecutionsCount() {
		return getService().getAcquireExecutionsCount();
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

	public static AcquireExecution updateAcquireApplicationExecutiion(
		String caseId, String paymentSection, String paymentDue) {

		return getService().updateAcquireApplicationExecutiion(
			caseId, paymentSection, paymentDue);
	}

	public static AcquireExecution updateAcquireApplicationExecutiion(
		String caseId, String paymentSection, String paymentDue,
		String contractSEction, java.util.Date dateContractExecuted) {

		return getService().updateAcquireApplicationExecutiion(
			caseId, paymentSection, paymentDue, contractSEction,
			dateContractExecuted);
	}

	/**
	 * Updates the acquire execution in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireExecutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireExecution the acquire execution
	 * @return the acquire execution that was updated
	 */
	public static AcquireExecution updateAcquireExecution(
		AcquireExecution acquireExecution) {

		return getService().updateAcquireExecution(acquireExecution);
	}

	public static AcquireExecutionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquireExecutionLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquireExecutionLocalServiceUtil.class,
			AcquireExecutionLocalService.class);

}