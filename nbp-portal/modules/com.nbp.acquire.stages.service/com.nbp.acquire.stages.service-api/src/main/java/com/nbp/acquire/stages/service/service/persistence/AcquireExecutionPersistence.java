/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireExecutionException;
import com.nbp.acquire.stages.service.model.AcquireExecution;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire execution service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireExecutionUtil
 * @generated
 */
@ProviderType
public interface AcquireExecutionPersistence
	extends BasePersistence<AcquireExecution> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireExecutionUtil} to access the acquire execution persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire execution where caseId = &#63; or throws a <code>NoSuchAcquireExecutionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire execution
	 * @throws NoSuchAcquireExecutionException if a matching acquire execution could not be found
	 */
	public AcquireExecution findBygetAcquireExecutionBy_CI(String caseId)
		throws NoSuchAcquireExecutionException;

	/**
	 * Returns the acquire execution where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire execution, or <code>null</code> if a matching acquire execution could not be found
	 */
	public AcquireExecution fetchBygetAcquireExecutionBy_CI(String caseId);

	/**
	 * Returns the acquire execution where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire execution, or <code>null</code> if a matching acquire execution could not be found
	 */
	public AcquireExecution fetchBygetAcquireExecutionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire execution where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire execution that was removed
	 */
	public AcquireExecution removeBygetAcquireExecutionBy_CI(String caseId)
		throws NoSuchAcquireExecutionException;

	/**
	 * Returns the number of acquire executions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire executions
	 */
	public int countBygetAcquireExecutionBy_CI(String caseId);

	/**
	 * Caches the acquire execution in the entity cache if it is enabled.
	 *
	 * @param acquireExecution the acquire execution
	 */
	public void cacheResult(AcquireExecution acquireExecution);

	/**
	 * Caches the acquire executions in the entity cache if it is enabled.
	 *
	 * @param acquireExecutions the acquire executions
	 */
	public void cacheResult(java.util.List<AcquireExecution> acquireExecutions);

	/**
	 * Creates a new acquire execution with the primary key. Does not add the acquire execution to the database.
	 *
	 * @param acquireExecutionId the primary key for the new acquire execution
	 * @return the new acquire execution
	 */
	public AcquireExecution create(long acquireExecutionId);

	/**
	 * Removes the acquire execution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution that was removed
	 * @throws NoSuchAcquireExecutionException if a acquire execution with the primary key could not be found
	 */
	public AcquireExecution remove(long acquireExecutionId)
		throws NoSuchAcquireExecutionException;

	public AcquireExecution updateImpl(AcquireExecution acquireExecution);

	/**
	 * Returns the acquire execution with the primary key or throws a <code>NoSuchAcquireExecutionException</code> if it could not be found.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution
	 * @throws NoSuchAcquireExecutionException if a acquire execution with the primary key could not be found
	 */
	public AcquireExecution findByPrimaryKey(long acquireExecutionId)
		throws NoSuchAcquireExecutionException;

	/**
	 * Returns the acquire execution with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution, or <code>null</code> if a acquire execution with the primary key could not be found
	 */
	public AcquireExecution fetchByPrimaryKey(long acquireExecutionId);

	/**
	 * Returns all the acquire executions.
	 *
	 * @return the acquire executions
	 */
	public java.util.List<AcquireExecution> findAll();

	/**
	 * Returns a range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @return the range of acquire executions
	 */
	public java.util.List<AcquireExecution> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire executions
	 */
	public java.util.List<AcquireExecution> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireExecution>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire executions
	 */
	public java.util.List<AcquireExecution> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireExecution>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire executions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire executions.
	 *
	 * @return the number of acquire executions
	 */
	public int countAll();

}