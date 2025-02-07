/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.ncra.application.form.service.exception.NoSuchNcraFeeSubmissionException;
import com.nbp.ncra.application.form.service.model.NcraFeeSubmission;
import com.nbp.ncra.application.form.service.model.NcraFeeSubmissionTable;
import com.nbp.ncra.application.form.service.model.impl.NcraFeeSubmissionImpl;
import com.nbp.ncra.application.form.service.model.impl.NcraFeeSubmissionModelImpl;
import com.nbp.ncra.application.form.service.service.persistence.NcraFeeSubmissionPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraFeeSubmissionUtil;
import com.nbp.ncra.application.form.service.service.persistence.impl.constants.NCRA_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the ncra fee submission service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcraFeeSubmissionPersistence.class)
public class NcraFeeSubmissionPersistenceImpl
	extends BasePersistenceImpl<NcraFeeSubmission>
	implements NcraFeeSubmissionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcraFeeSubmissionUtil</code> to access the ncra fee submission persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcraFeeSubmissionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcraFee_By_NCRA_Id;
	private FinderPath _finderPathCountBygetNcraFee_By_NCRA_Id;

	/**
	 * Returns the ncra fee submission where ncraApplicationId = &#63; or throws a <code>NoSuchNcraFeeSubmissionException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra fee submission
	 * @throws NoSuchNcraFeeSubmissionException if a matching ncra fee submission could not be found
	 */
	@Override
	public NcraFeeSubmission findBygetNcraFee_By_NCRA_Id(long ncraApplicationId)
		throws NoSuchNcraFeeSubmissionException {

		NcraFeeSubmission ncraFeeSubmission = fetchBygetNcraFee_By_NCRA_Id(
			ncraApplicationId);

		if (ncraFeeSubmission == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncraApplicationId=");
			sb.append(ncraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraFeeSubmissionException(sb.toString());
		}

		return ncraFeeSubmission;
	}

	/**
	 * Returns the ncra fee submission where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra fee submission, or <code>null</code> if a matching ncra fee submission could not be found
	 */
	@Override
	public NcraFeeSubmission fetchBygetNcraFee_By_NCRA_Id(
		long ncraApplicationId) {

		return fetchBygetNcraFee_By_NCRA_Id(ncraApplicationId, true);
	}

	/**
	 * Returns the ncra fee submission where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra fee submission, or <code>null</code> if a matching ncra fee submission could not be found
	 */
	@Override
	public NcraFeeSubmission fetchBygetNcraFee_By_NCRA_Id(
		long ncraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcraFee_By_NCRA_Id, finderArgs, this);
		}

		if (result instanceof NcraFeeSubmission) {
			NcraFeeSubmission ncraFeeSubmission = (NcraFeeSubmission)result;

			if (ncraApplicationId != ncraFeeSubmission.getNcraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRAFEESUBMISSION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRAFEE_BY_NCRA_ID_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

				List<NcraFeeSubmission> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraFee_By_NCRA_Id, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncraApplicationId};
							}

							_log.warn(
								"NcraFeeSubmissionPersistenceImpl.fetchBygetNcraFee_By_NCRA_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraFeeSubmission ncraFeeSubmission = list.get(0);

					result = ncraFeeSubmission;

					cacheResult(ncraFeeSubmission);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (NcraFeeSubmission)result;
		}
	}

	/**
	 * Removes the ncra fee submission where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra fee submission that was removed
	 */
	@Override
	public NcraFeeSubmission removeBygetNcraFee_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraFeeSubmissionException {

		NcraFeeSubmission ncraFeeSubmission = findBygetNcraFee_By_NCRA_Id(
			ncraApplicationId);

		return remove(ncraFeeSubmission);
	}

	/**
	 * Returns the number of ncra fee submissions where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra fee submissions
	 */
	@Override
	public int countBygetNcraFee_By_NCRA_Id(long ncraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcraFee_By_NCRA_Id;

		Object[] finderArgs = new Object[] {ncraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAFEESUBMISSION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRAFEE_BY_NCRA_ID_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETNCRAFEE_BY_NCRA_ID_NCRAAPPLICATIONID_2 =
			"ncraFeeSubmission.ncraApplicationId = ?";

	public NcraFeeSubmissionPersistenceImpl() {
		setModelClass(NcraFeeSubmission.class);

		setModelImplClass(NcraFeeSubmissionImpl.class);
		setModelPKClass(long.class);

		setTable(NcraFeeSubmissionTable.INSTANCE);
	}

	/**
	 * Caches the ncra fee submission in the entity cache if it is enabled.
	 *
	 * @param ncraFeeSubmission the ncra fee submission
	 */
	@Override
	public void cacheResult(NcraFeeSubmission ncraFeeSubmission) {
		entityCache.putResult(
			NcraFeeSubmissionImpl.class, ncraFeeSubmission.getPrimaryKey(),
			ncraFeeSubmission);

		finderCache.putResult(
			_finderPathFetchBygetNcraFee_By_NCRA_Id,
			new Object[] {ncraFeeSubmission.getNcraApplicationId()},
			ncraFeeSubmission);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncra fee submissions in the entity cache if it is enabled.
	 *
	 * @param ncraFeeSubmissions the ncra fee submissions
	 */
	@Override
	public void cacheResult(List<NcraFeeSubmission> ncraFeeSubmissions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncraFeeSubmissions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcraFeeSubmission ncraFeeSubmission : ncraFeeSubmissions) {
			if (entityCache.getResult(
					NcraFeeSubmissionImpl.class,
					ncraFeeSubmission.getPrimaryKey()) == null) {

				cacheResult(ncraFeeSubmission);
			}
		}
	}

	/**
	 * Clears the cache for all ncra fee submissions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcraFeeSubmissionImpl.class);

		finderCache.clearCache(NcraFeeSubmissionImpl.class);
	}

	/**
	 * Clears the cache for the ncra fee submission.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcraFeeSubmission ncraFeeSubmission) {
		entityCache.removeResult(
			NcraFeeSubmissionImpl.class, ncraFeeSubmission);
	}

	@Override
	public void clearCache(List<NcraFeeSubmission> ncraFeeSubmissions) {
		for (NcraFeeSubmission ncraFeeSubmission : ncraFeeSubmissions) {
			entityCache.removeResult(
				NcraFeeSubmissionImpl.class, ncraFeeSubmission);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcraFeeSubmissionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcraFeeSubmissionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcraFeeSubmissionModelImpl ncraFeeSubmissionModelImpl) {

		Object[] args = new Object[] {
			ncraFeeSubmissionModelImpl.getNcraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcraFee_By_NCRA_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraFee_By_NCRA_Id, args,
			ncraFeeSubmissionModelImpl);
	}

	/**
	 * Creates a new ncra fee submission with the primary key. Does not add the ncra fee submission to the database.
	 *
	 * @param ncraFeeSubmissionId the primary key for the new ncra fee submission
	 * @return the new ncra fee submission
	 */
	@Override
	public NcraFeeSubmission create(long ncraFeeSubmissionId) {
		NcraFeeSubmission ncraFeeSubmission = new NcraFeeSubmissionImpl();

		ncraFeeSubmission.setNew(true);
		ncraFeeSubmission.setPrimaryKey(ncraFeeSubmissionId);

		ncraFeeSubmission.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncraFeeSubmission;
	}

	/**
	 * Removes the ncra fee submission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission that was removed
	 * @throws NoSuchNcraFeeSubmissionException if a ncra fee submission with the primary key could not be found
	 */
	@Override
	public NcraFeeSubmission remove(long ncraFeeSubmissionId)
		throws NoSuchNcraFeeSubmissionException {

		return remove((Serializable)ncraFeeSubmissionId);
	}

	/**
	 * Removes the ncra fee submission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncra fee submission
	 * @return the ncra fee submission that was removed
	 * @throws NoSuchNcraFeeSubmissionException if a ncra fee submission with the primary key could not be found
	 */
	@Override
	public NcraFeeSubmission remove(Serializable primaryKey)
		throws NoSuchNcraFeeSubmissionException {

		Session session = null;

		try {
			session = openSession();

			NcraFeeSubmission ncraFeeSubmission =
				(NcraFeeSubmission)session.get(
					NcraFeeSubmissionImpl.class, primaryKey);

			if (ncraFeeSubmission == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcraFeeSubmissionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncraFeeSubmission);
		}
		catch (NoSuchNcraFeeSubmissionException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected NcraFeeSubmission removeImpl(
		NcraFeeSubmission ncraFeeSubmission) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncraFeeSubmission)) {
				ncraFeeSubmission = (NcraFeeSubmission)session.get(
					NcraFeeSubmissionImpl.class,
					ncraFeeSubmission.getPrimaryKeyObj());
			}

			if (ncraFeeSubmission != null) {
				session.delete(ncraFeeSubmission);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncraFeeSubmission != null) {
			clearCache(ncraFeeSubmission);
		}

		return ncraFeeSubmission;
	}

	@Override
	public NcraFeeSubmission updateImpl(NcraFeeSubmission ncraFeeSubmission) {
		boolean isNew = ncraFeeSubmission.isNew();

		if (!(ncraFeeSubmission instanceof NcraFeeSubmissionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncraFeeSubmission.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncraFeeSubmission);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncraFeeSubmission proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcraFeeSubmission implementation " +
					ncraFeeSubmission.getClass());
		}

		NcraFeeSubmissionModelImpl ncraFeeSubmissionModelImpl =
			(NcraFeeSubmissionModelImpl)ncraFeeSubmission;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncraFeeSubmission.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncraFeeSubmission.setCreateDate(date);
			}
			else {
				ncraFeeSubmission.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncraFeeSubmissionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncraFeeSubmission.setModifiedDate(date);
			}
			else {
				ncraFeeSubmission.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncraFeeSubmission);
			}
			else {
				ncraFeeSubmission = (NcraFeeSubmission)session.merge(
					ncraFeeSubmission);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcraFeeSubmissionImpl.class, ncraFeeSubmissionModelImpl, false,
			true);

		cacheUniqueFindersCache(ncraFeeSubmissionModelImpl);

		if (isNew) {
			ncraFeeSubmission.setNew(false);
		}

		ncraFeeSubmission.resetOriginalValues();

		return ncraFeeSubmission;
	}

	/**
	 * Returns the ncra fee submission with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncra fee submission
	 * @return the ncra fee submission
	 * @throws NoSuchNcraFeeSubmissionException if a ncra fee submission with the primary key could not be found
	 */
	@Override
	public NcraFeeSubmission findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcraFeeSubmissionException {

		NcraFeeSubmission ncraFeeSubmission = fetchByPrimaryKey(primaryKey);

		if (ncraFeeSubmission == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcraFeeSubmissionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncraFeeSubmission;
	}

	/**
	 * Returns the ncra fee submission with the primary key or throws a <code>NoSuchNcraFeeSubmissionException</code> if it could not be found.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission
	 * @throws NoSuchNcraFeeSubmissionException if a ncra fee submission with the primary key could not be found
	 */
	@Override
	public NcraFeeSubmission findByPrimaryKey(long ncraFeeSubmissionId)
		throws NoSuchNcraFeeSubmissionException {

		return findByPrimaryKey((Serializable)ncraFeeSubmissionId);
	}

	/**
	 * Returns the ncra fee submission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission, or <code>null</code> if a ncra fee submission with the primary key could not be found
	 */
	@Override
	public NcraFeeSubmission fetchByPrimaryKey(long ncraFeeSubmissionId) {
		return fetchByPrimaryKey((Serializable)ncraFeeSubmissionId);
	}

	/**
	 * Returns all the ncra fee submissions.
	 *
	 * @return the ncra fee submissions
	 */
	@Override
	public List<NcraFeeSubmission> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @return the range of ncra fee submissions
	 */
	@Override
	public List<NcraFeeSubmission> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra fee submissions
	 */
	@Override
	public List<NcraFeeSubmission> findAll(
		int start, int end,
		OrderByComparator<NcraFeeSubmission> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra fee submissions
	 */
	@Override
	public List<NcraFeeSubmission> findAll(
		int start, int end,
		OrderByComparator<NcraFeeSubmission> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<NcraFeeSubmission> list = null;

		if (useFinderCache) {
			list = (List<NcraFeeSubmission>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCRAFEESUBMISSION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCRAFEESUBMISSION;

				sql = sql.concat(NcraFeeSubmissionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcraFeeSubmission>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the ncra fee submissions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcraFeeSubmission ncraFeeSubmission : findAll()) {
			remove(ncraFeeSubmission);
		}
	}

	/**
	 * Returns the number of ncra fee submissions.
	 *
	 * @return the number of ncra fee submissions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCRAFEESUBMISSION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "ncraFeeSubmissionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCRAFEESUBMISSION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcraFeeSubmissionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncra fee submission persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetNcraFee_By_NCRA_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraFee_By_NCRA_Id",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, true);

		_finderPathCountBygetNcraFee_By_NCRA_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraFee_By_NCRA_Id", new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, false);

		NcraFeeSubmissionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcraFeeSubmissionUtil.setPersistence(null);

		entityCache.removeCache(NcraFeeSubmissionImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCRAFEESUBMISSION =
		"SELECT ncraFeeSubmission FROM NcraFeeSubmission ncraFeeSubmission";

	private static final String _SQL_SELECT_NCRAFEESUBMISSION_WHERE =
		"SELECT ncraFeeSubmission FROM NcraFeeSubmission ncraFeeSubmission WHERE ";

	private static final String _SQL_COUNT_NCRAFEESUBMISSION =
		"SELECT COUNT(ncraFeeSubmission) FROM NcraFeeSubmission ncraFeeSubmission";

	private static final String _SQL_COUNT_NCRAFEESUBMISSION_WHERE =
		"SELECT COUNT(ncraFeeSubmission) FROM NcraFeeSubmission ncraFeeSubmission WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncraFeeSubmission.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcraFeeSubmission exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcraFeeSubmission exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcraFeeSubmissionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}