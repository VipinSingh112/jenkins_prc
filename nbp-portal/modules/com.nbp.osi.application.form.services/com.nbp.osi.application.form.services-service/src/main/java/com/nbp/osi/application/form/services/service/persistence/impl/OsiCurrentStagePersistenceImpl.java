/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence.impl;

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

import com.nbp.osi.application.form.services.exception.NoSuchOsiCurrentStageException;
import com.nbp.osi.application.form.services.model.OsiCurrentStage;
import com.nbp.osi.application.form.services.model.OsiCurrentStageTable;
import com.nbp.osi.application.form.services.model.impl.OsiCurrentStageImpl;
import com.nbp.osi.application.form.services.model.impl.OsiCurrentStageModelImpl;
import com.nbp.osi.application.form.services.service.persistence.OsiCurrentStagePersistence;
import com.nbp.osi.application.form.services.service.persistence.OsiCurrentStageUtil;
import com.nbp.osi.application.form.services.service.persistence.impl.constants.OSIPersistenceConstants;

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
 * The persistence implementation for the osi current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiCurrentStagePersistence.class)
public class OsiCurrentStagePersistenceImpl
	extends BasePersistenceImpl<OsiCurrentStage>
	implements OsiCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiCurrentStageUtil</code> to access the osi current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns the osi current stage where osiApplicationId = &#63; or throws a <code>NoSuchOsiCurrentStageException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi current stage
	 * @throws NoSuchOsiCurrentStageException if a matching osi current stage could not be found
	 */
	@Override
	public OsiCurrentStage findBygetOsiById(long osiApplicationId)
		throws NoSuchOsiCurrentStageException {

		OsiCurrentStage osiCurrentStage = fetchBygetOsiById(osiApplicationId);

		if (osiCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiApplicationId=");
			sb.append(osiApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiCurrentStageException(sb.toString());
		}

		return osiCurrentStage;
	}

	/**
	 * Returns the osi current stage where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi current stage, or <code>null</code> if a matching osi current stage could not be found
	 */
	@Override
	public OsiCurrentStage fetchBygetOsiById(long osiApplicationId) {
		return fetchBygetOsiById(osiApplicationId, true);
	}

	/**
	 * Returns the osi current stage where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi current stage, or <code>null</code> if a matching osi current stage could not be found
	 */
	@Override
	public OsiCurrentStage fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs, this);
		}

		if (result instanceof OsiCurrentStage) {
			OsiCurrentStage osiCurrentStage = (OsiCurrentStage)result;

			if (osiApplicationId != osiCurrentStage.getOsiApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSICURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				List<OsiCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiApplicationId};
							}

							_log.warn(
								"OsiCurrentStagePersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiCurrentStage osiCurrentStage = list.get(0);

					result = osiCurrentStage;

					cacheResult(osiCurrentStage);
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
			return (OsiCurrentStage)result;
		}
	}

	/**
	 * Removes the osi current stage where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the osi current stage that was removed
	 */
	@Override
	public OsiCurrentStage removeBygetOsiById(long osiApplicationId)
		throws NoSuchOsiCurrentStageException {

		OsiCurrentStage osiCurrentStage = findBygetOsiById(osiApplicationId);

		return remove(osiCurrentStage);
	}

	/**
	 * Returns the number of osi current stages where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi current stages
	 */
	@Override
	public int countBygetOsiById(long osiApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSICURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2 =
		"osiCurrentStage.osiApplicationId = ?";

	public OsiCurrentStagePersistenceImpl() {
		setModelClass(OsiCurrentStage.class);

		setModelImplClass(OsiCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(OsiCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the osi current stage in the entity cache if it is enabled.
	 *
	 * @param osiCurrentStage the osi current stage
	 */
	@Override
	public void cacheResult(OsiCurrentStage osiCurrentStage) {
		entityCache.putResult(
			OsiCurrentStageImpl.class, osiCurrentStage.getPrimaryKey(),
			osiCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {osiCurrentStage.getOsiApplicationId()},
			osiCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi current stages in the entity cache if it is enabled.
	 *
	 * @param osiCurrentStages the osi current stages
	 */
	@Override
	public void cacheResult(List<OsiCurrentStage> osiCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiCurrentStage osiCurrentStage : osiCurrentStages) {
			if (entityCache.getResult(
					OsiCurrentStageImpl.class,
					osiCurrentStage.getPrimaryKey()) == null) {

				cacheResult(osiCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all osi current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiCurrentStageImpl.class);

		finderCache.clearCache(OsiCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the osi current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiCurrentStage osiCurrentStage) {
		entityCache.removeResult(OsiCurrentStageImpl.class, osiCurrentStage);
	}

	@Override
	public void clearCache(List<OsiCurrentStage> osiCurrentStages) {
		for (OsiCurrentStage osiCurrentStage : osiCurrentStages) {
			entityCache.removeResult(
				OsiCurrentStageImpl.class, osiCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OsiCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiCurrentStageModelImpl osiCurrentStageModelImpl) {

		Object[] args = new Object[] {
			osiCurrentStageModelImpl.getOsiApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, osiCurrentStageModelImpl);
	}

	/**
	 * Creates a new osi current stage with the primary key. Does not add the osi current stage to the database.
	 *
	 * @param osiCurrentStageId the primary key for the new osi current stage
	 * @return the new osi current stage
	 */
	@Override
	public OsiCurrentStage create(long osiCurrentStageId) {
		OsiCurrentStage osiCurrentStage = new OsiCurrentStageImpl();

		osiCurrentStage.setNew(true);
		osiCurrentStage.setPrimaryKey(osiCurrentStageId);

		osiCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiCurrentStage;
	}

	/**
	 * Removes the osi current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage that was removed
	 * @throws NoSuchOsiCurrentStageException if a osi current stage with the primary key could not be found
	 */
	@Override
	public OsiCurrentStage remove(long osiCurrentStageId)
		throws NoSuchOsiCurrentStageException {

		return remove((Serializable)osiCurrentStageId);
	}

	/**
	 * Removes the osi current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi current stage
	 * @return the osi current stage that was removed
	 * @throws NoSuchOsiCurrentStageException if a osi current stage with the primary key could not be found
	 */
	@Override
	public OsiCurrentStage remove(Serializable primaryKey)
		throws NoSuchOsiCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			OsiCurrentStage osiCurrentStage = (OsiCurrentStage)session.get(
				OsiCurrentStageImpl.class, primaryKey);

			if (osiCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiCurrentStage);
		}
		catch (NoSuchOsiCurrentStageException noSuchEntityException) {
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
	protected OsiCurrentStage removeImpl(OsiCurrentStage osiCurrentStage) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiCurrentStage)) {
				osiCurrentStage = (OsiCurrentStage)session.get(
					OsiCurrentStageImpl.class,
					osiCurrentStage.getPrimaryKeyObj());
			}

			if (osiCurrentStage != null) {
				session.delete(osiCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiCurrentStage != null) {
			clearCache(osiCurrentStage);
		}

		return osiCurrentStage;
	}

	@Override
	public OsiCurrentStage updateImpl(OsiCurrentStage osiCurrentStage) {
		boolean isNew = osiCurrentStage.isNew();

		if (!(osiCurrentStage instanceof OsiCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiCurrentStage implementation " +
					osiCurrentStage.getClass());
		}

		OsiCurrentStageModelImpl osiCurrentStageModelImpl =
			(OsiCurrentStageModelImpl)osiCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiCurrentStage.setCreateDate(date);
			}
			else {
				osiCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiCurrentStage.setModifiedDate(date);
			}
			else {
				osiCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiCurrentStage);
			}
			else {
				osiCurrentStage = (OsiCurrentStage)session.merge(
					osiCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiCurrentStageImpl.class, osiCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(osiCurrentStageModelImpl);

		if (isNew) {
			osiCurrentStage.setNew(false);
		}

		osiCurrentStage.resetOriginalValues();

		return osiCurrentStage;
	}

	/**
	 * Returns the osi current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi current stage
	 * @return the osi current stage
	 * @throws NoSuchOsiCurrentStageException if a osi current stage with the primary key could not be found
	 */
	@Override
	public OsiCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiCurrentStageException {

		OsiCurrentStage osiCurrentStage = fetchByPrimaryKey(primaryKey);

		if (osiCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiCurrentStage;
	}

	/**
	 * Returns the osi current stage with the primary key or throws a <code>NoSuchOsiCurrentStageException</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage
	 * @throws NoSuchOsiCurrentStageException if a osi current stage with the primary key could not be found
	 */
	@Override
	public OsiCurrentStage findByPrimaryKey(long osiCurrentStageId)
		throws NoSuchOsiCurrentStageException {

		return findByPrimaryKey((Serializable)osiCurrentStageId);
	}

	/**
	 * Returns the osi current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage, or <code>null</code> if a osi current stage with the primary key could not be found
	 */
	@Override
	public OsiCurrentStage fetchByPrimaryKey(long osiCurrentStageId) {
		return fetchByPrimaryKey((Serializable)osiCurrentStageId);
	}

	/**
	 * Returns all the osi current stages.
	 *
	 * @return the osi current stages
	 */
	@Override
	public List<OsiCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @return the range of osi current stages
	 */
	@Override
	public List<OsiCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi current stages
	 */
	@Override
	public List<OsiCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OsiCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi current stages
	 */
	@Override
	public List<OsiCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OsiCurrentStage> orderByComparator,
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

		List<OsiCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<OsiCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSICURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSICURRENTSTAGE;

				sql = sql.concat(OsiCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiCurrentStage>)QueryUtil.list(
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
	 * Removes all the osi current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiCurrentStage osiCurrentStage : findAll()) {
			remove(osiCurrentStage);
		}
	}

	/**
	 * Returns the number of osi current stages.
	 *
	 * @return the number of osi current stages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OSICURRENTSTAGE);

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
		return "osiCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSICURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi current stage persistence.
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

		_finderPathFetchBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, false);

		OsiCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(OsiCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSICURRENTSTAGE =
		"SELECT osiCurrentStage FROM OsiCurrentStage osiCurrentStage";

	private static final String _SQL_SELECT_OSICURRENTSTAGE_WHERE =
		"SELECT osiCurrentStage FROM OsiCurrentStage osiCurrentStage WHERE ";

	private static final String _SQL_COUNT_OSICURRENTSTAGE =
		"SELECT COUNT(osiCurrentStage) FROM OsiCurrentStage osiCurrentStage";

	private static final String _SQL_COUNT_OSICURRENTSTAGE_WHERE =
		"SELECT COUNT(osiCurrentStage) FROM OsiCurrentStage osiCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "osiCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}