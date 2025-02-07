/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchsezSubmissionChecklistException;
import com.nbp.sez.status.application.form.service.model.impl.sezSubmissionChecklistImpl;
import com.nbp.sez.status.application.form.service.model.impl.sezSubmissionChecklistModelImpl;
import com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist;
import com.nbp.sez.status.application.form.service.model.sezSubmissionChecklistTable;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;
import com.nbp.sez.status.application.form.service.service.persistence.sezSubmissionChecklistPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.sezSubmissionChecklistUtil;

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
 * The persistence implementation for the sez submission checklist service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = sezSubmissionChecklistPersistence.class)
public class sezSubmissionChecklistPersistenceImpl
	extends BasePersistenceImpl<sezSubmissionChecklist>
	implements sezSubmissionChecklistPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>sezSubmissionChecklistUtil</code> to access the sez submission checklist persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		sezSubmissionChecklistImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez submission checklist where sezStatusApplicationId = &#63; or throws a <code>NoSuchsezSubmissionChecklistException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez submission checklist
	 * @throws NoSuchsezSubmissionChecklistException if a matching sez submission checklist could not be found
	 */
	@Override
	public sezSubmissionChecklist findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchsezSubmissionChecklistException {

		sezSubmissionChecklist sezSubmissionChecklist =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezSubmissionChecklist == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchsezSubmissionChecklistException(sb.toString());
		}

		return sezSubmissionChecklist;
	}

	/**
	 * Returns the sez submission checklist where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez submission checklist, or <code>null</code> if a matching sez submission checklist could not be found
	 */
	@Override
	public sezSubmissionChecklist fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez submission checklist where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez submission checklist, or <code>null</code> if a matching sez submission checklist could not be found
	 */
	@Override
	public sezSubmissionChecklist fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof sezSubmissionChecklist) {
			sezSubmissionChecklist sezSubmissionChecklist =
				(sezSubmissionChecklist)result;

			if (sezStatusApplicationId !=
					sezSubmissionChecklist.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSUBMISSIONCHECKLIST_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<sezSubmissionChecklist> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"sezSubmissionChecklistPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					sezSubmissionChecklist sezSubmissionChecklist = list.get(0);

					result = sezSubmissionChecklist;

					cacheResult(sezSubmissionChecklist);
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
			return (sezSubmissionChecklist)result;
		}
	}

	/**
	 * Removes the sez submission checklist where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez submission checklist that was removed
	 */
	@Override
	public sezSubmissionChecklist removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchsezSubmissionChecklistException {

		sezSubmissionChecklist sezSubmissionChecklist =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezSubmissionChecklist);
	}

	/**
	 * Returns the number of sez submission checklists where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez submission checklists
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSUBMISSIONCHECKLIST_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezSubmissionChecklist.sezStatusApplicationId = ?";

	public sezSubmissionChecklistPersistenceImpl() {
		setModelClass(sezSubmissionChecklist.class);

		setModelImplClass(sezSubmissionChecklistImpl.class);
		setModelPKClass(long.class);

		setTable(sezSubmissionChecklistTable.INSTANCE);
	}

	/**
	 * Caches the sez submission checklist in the entity cache if it is enabled.
	 *
	 * @param sezSubmissionChecklist the sez submission checklist
	 */
	@Override
	public void cacheResult(sezSubmissionChecklist sezSubmissionChecklist) {
		entityCache.putResult(
			sezSubmissionChecklistImpl.class,
			sezSubmissionChecklist.getPrimaryKey(), sezSubmissionChecklist);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezSubmissionChecklist.getSezStatusApplicationId()},
			sezSubmissionChecklist);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez submission checklists in the entity cache if it is enabled.
	 *
	 * @param sezSubmissionChecklists the sez submission checklists
	 */
	@Override
	public void cacheResult(
		List<sezSubmissionChecklist> sezSubmissionChecklists) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezSubmissionChecklists.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (sezSubmissionChecklist sezSubmissionChecklist :
				sezSubmissionChecklists) {

			if (entityCache.getResult(
					sezSubmissionChecklistImpl.class,
					sezSubmissionChecklist.getPrimaryKey()) == null) {

				cacheResult(sezSubmissionChecklist);
			}
		}
	}

	/**
	 * Clears the cache for all sez submission checklists.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(sezSubmissionChecklistImpl.class);

		finderCache.clearCache(sezSubmissionChecklistImpl.class);
	}

	/**
	 * Clears the cache for the sez submission checklist.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(sezSubmissionChecklist sezSubmissionChecklist) {
		entityCache.removeResult(
			sezSubmissionChecklistImpl.class, sezSubmissionChecklist);
	}

	@Override
	public void clearCache(
		List<sezSubmissionChecklist> sezSubmissionChecklists) {

		for (sezSubmissionChecklist sezSubmissionChecklist :
				sezSubmissionChecklists) {

			entityCache.removeResult(
				sezSubmissionChecklistImpl.class, sezSubmissionChecklist);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(sezSubmissionChecklistImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				sezSubmissionChecklistImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		sezSubmissionChecklistModelImpl sezSubmissionChecklistModelImpl) {

		Object[] args = new Object[] {
			sezSubmissionChecklistModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezSubmissionChecklistModelImpl);
	}

	/**
	 * Creates a new sez submission checklist with the primary key. Does not add the sez submission checklist to the database.
	 *
	 * @param sezSubmissionChecklistId the primary key for the new sez submission checklist
	 * @return the new sez submission checklist
	 */
	@Override
	public sezSubmissionChecklist create(long sezSubmissionChecklistId) {
		sezSubmissionChecklist sezSubmissionChecklist =
			new sezSubmissionChecklistImpl();

		sezSubmissionChecklist.setNew(true);
		sezSubmissionChecklist.setPrimaryKey(sezSubmissionChecklistId);

		sezSubmissionChecklist.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezSubmissionChecklist;
	}

	/**
	 * Removes the sez submission checklist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezSubmissionChecklistId the primary key of the sez submission checklist
	 * @return the sez submission checklist that was removed
	 * @throws NoSuchsezSubmissionChecklistException if a sez submission checklist with the primary key could not be found
	 */
	@Override
	public sezSubmissionChecklist remove(long sezSubmissionChecklistId)
		throws NoSuchsezSubmissionChecklistException {

		return remove((Serializable)sezSubmissionChecklistId);
	}

	/**
	 * Removes the sez submission checklist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez submission checklist
	 * @return the sez submission checklist that was removed
	 * @throws NoSuchsezSubmissionChecklistException if a sez submission checklist with the primary key could not be found
	 */
	@Override
	public sezSubmissionChecklist remove(Serializable primaryKey)
		throws NoSuchsezSubmissionChecklistException {

		Session session = null;

		try {
			session = openSession();

			sezSubmissionChecklist sezSubmissionChecklist =
				(sezSubmissionChecklist)session.get(
					sezSubmissionChecklistImpl.class, primaryKey);

			if (sezSubmissionChecklist == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsezSubmissionChecklistException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezSubmissionChecklist);
		}
		catch (NoSuchsezSubmissionChecklistException noSuchEntityException) {
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
	protected sezSubmissionChecklist removeImpl(
		sezSubmissionChecklist sezSubmissionChecklist) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezSubmissionChecklist)) {
				sezSubmissionChecklist = (sezSubmissionChecklist)session.get(
					sezSubmissionChecklistImpl.class,
					sezSubmissionChecklist.getPrimaryKeyObj());
			}

			if (sezSubmissionChecklist != null) {
				session.delete(sezSubmissionChecklist);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezSubmissionChecklist != null) {
			clearCache(sezSubmissionChecklist);
		}

		return sezSubmissionChecklist;
	}

	@Override
	public sezSubmissionChecklist updateImpl(
		sezSubmissionChecklist sezSubmissionChecklist) {

		boolean isNew = sezSubmissionChecklist.isNew();

		if (!(sezSubmissionChecklist instanceof
				sezSubmissionChecklistModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezSubmissionChecklist.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezSubmissionChecklist);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezSubmissionChecklist proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom sezSubmissionChecklist implementation " +
					sezSubmissionChecklist.getClass());
		}

		sezSubmissionChecklistModelImpl sezSubmissionChecklistModelImpl =
			(sezSubmissionChecklistModelImpl)sezSubmissionChecklist;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezSubmissionChecklist.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezSubmissionChecklist.setCreateDate(date);
			}
			else {
				sezSubmissionChecklist.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezSubmissionChecklistModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezSubmissionChecklist.setModifiedDate(date);
			}
			else {
				sezSubmissionChecklist.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezSubmissionChecklist);
			}
			else {
				sezSubmissionChecklist = (sezSubmissionChecklist)session.merge(
					sezSubmissionChecklist);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			sezSubmissionChecklistImpl.class, sezSubmissionChecklistModelImpl,
			false, true);

		cacheUniqueFindersCache(sezSubmissionChecklistModelImpl);

		if (isNew) {
			sezSubmissionChecklist.setNew(false);
		}

		sezSubmissionChecklist.resetOriginalValues();

		return sezSubmissionChecklist;
	}

	/**
	 * Returns the sez submission checklist with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez submission checklist
	 * @return the sez submission checklist
	 * @throws NoSuchsezSubmissionChecklistException if a sez submission checklist with the primary key could not be found
	 */
	@Override
	public sezSubmissionChecklist findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsezSubmissionChecklistException {

		sezSubmissionChecklist sezSubmissionChecklist = fetchByPrimaryKey(
			primaryKey);

		if (sezSubmissionChecklist == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsezSubmissionChecklistException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezSubmissionChecklist;
	}

	/**
	 * Returns the sez submission checklist with the primary key or throws a <code>NoSuchsezSubmissionChecklistException</code> if it could not be found.
	 *
	 * @param sezSubmissionChecklistId the primary key of the sez submission checklist
	 * @return the sez submission checklist
	 * @throws NoSuchsezSubmissionChecklistException if a sez submission checklist with the primary key could not be found
	 */
	@Override
	public sezSubmissionChecklist findByPrimaryKey(
			long sezSubmissionChecklistId)
		throws NoSuchsezSubmissionChecklistException {

		return findByPrimaryKey((Serializable)sezSubmissionChecklistId);
	}

	/**
	 * Returns the sez submission checklist with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezSubmissionChecklistId the primary key of the sez submission checklist
	 * @return the sez submission checklist, or <code>null</code> if a sez submission checklist with the primary key could not be found
	 */
	@Override
	public sezSubmissionChecklist fetchByPrimaryKey(
		long sezSubmissionChecklistId) {

		return fetchByPrimaryKey((Serializable)sezSubmissionChecklistId);
	}

	/**
	 * Returns all the sez submission checklists.
	 *
	 * @return the sez submission checklists
	 */
	@Override
	public List<sezSubmissionChecklist> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez submission checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezSubmissionChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez submission checklists
	 * @param end the upper bound of the range of sez submission checklists (not inclusive)
	 * @return the range of sez submission checklists
	 */
	@Override
	public List<sezSubmissionChecklist> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez submission checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezSubmissionChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez submission checklists
	 * @param end the upper bound of the range of sez submission checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez submission checklists
	 */
	@Override
	public List<sezSubmissionChecklist> findAll(
		int start, int end,
		OrderByComparator<sezSubmissionChecklist> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez submission checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezSubmissionChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez submission checklists
	 * @param end the upper bound of the range of sez submission checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez submission checklists
	 */
	@Override
	public List<sezSubmissionChecklist> findAll(
		int start, int end,
		OrderByComparator<sezSubmissionChecklist> orderByComparator,
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

		List<sezSubmissionChecklist> list = null;

		if (useFinderCache) {
			list = (List<sezSubmissionChecklist>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSUBMISSIONCHECKLIST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSUBMISSIONCHECKLIST;

				sql = sql.concat(sezSubmissionChecklistModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<sezSubmissionChecklist>)QueryUtil.list(
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
	 * Removes all the sez submission checklists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (sezSubmissionChecklist sezSubmissionChecklist : findAll()) {
			remove(sezSubmissionChecklist);
		}
	}

	/**
	 * Returns the number of sez submission checklists.
	 *
	 * @return the number of sez submission checklists
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_SEZSUBMISSIONCHECKLIST);

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
		return "sezSubmissionChecklistId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSUBMISSIONCHECKLIST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return sezSubmissionChecklistModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez submission checklist persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		sezSubmissionChecklistUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		sezSubmissionChecklistUtil.setPersistence(null);

		entityCache.removeCache(sezSubmissionChecklistImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZSUBMISSIONCHECKLIST =
		"SELECT sezSubmissionChecklist FROM sezSubmissionChecklist sezSubmissionChecklist";

	private static final String _SQL_SELECT_SEZSUBMISSIONCHECKLIST_WHERE =
		"SELECT sezSubmissionChecklist FROM sezSubmissionChecklist sezSubmissionChecklist WHERE ";

	private static final String _SQL_COUNT_SEZSUBMISSIONCHECKLIST =
		"SELECT COUNT(sezSubmissionChecklist) FROM sezSubmissionChecklist sezSubmissionChecklist";

	private static final String _SQL_COUNT_SEZSUBMISSIONCHECKLIST_WHERE =
		"SELECT COUNT(sezSubmissionChecklist) FROM sezSubmissionChecklist sezSubmissionChecklist WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezSubmissionChecklist.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No sezSubmissionChecklist exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No sezSubmissionChecklist exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		sezSubmissionChecklistPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}