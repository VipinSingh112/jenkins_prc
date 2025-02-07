/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchJTBCurrentStageException;
import com.nbp.jtb.application.form.service.model.JTBCurrentStage;
import com.nbp.jtb.application.form.service.model.JTBCurrentStageTable;
import com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageImpl;
import com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.JTBCurrentStagePersistence;
import com.nbp.jtb.application.form.service.service.persistence.JTBCurrentStageUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the jtb current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JTBCurrentStagePersistence.class)
public class JTBCurrentStagePersistenceImpl
	extends BasePersistenceImpl<JTBCurrentStage>
	implements JTBCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JTBCurrentStageUtil</code> to access the jtb current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JTBCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetByJTB_Stage;
	private FinderPath _finderPathCountBygetByJTB_Stage;

	/**
	 * Returns the jtb current stage where jtbApplicationId = &#63; or throws a <code>NoSuchJTBCurrentStageException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb current stage
	 * @throws NoSuchJTBCurrentStageException if a matching jtb current stage could not be found
	 */
	@Override
	public JTBCurrentStage findBygetByJTB_Stage(long jtbApplicationId)
		throws NoSuchJTBCurrentStageException {

		JTBCurrentStage jtbCurrentStage = fetchBygetByJTB_Stage(
			jtbApplicationId);

		if (jtbCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJTBCurrentStageException(sb.toString());
		}

		return jtbCurrentStage;
	}

	/**
	 * Returns the jtb current stage where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb current stage, or <code>null</code> if a matching jtb current stage could not be found
	 */
	@Override
	public JTBCurrentStage fetchBygetByJTB_Stage(long jtbApplicationId) {
		return fetchBygetByJTB_Stage(jtbApplicationId, true);
	}

	/**
	 * Returns the jtb current stage where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb current stage, or <code>null</code> if a matching jtb current stage could not be found
	 */
	@Override
	public JTBCurrentStage fetchBygetByJTB_Stage(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetByJTB_Stage, finderArgs, this);
		}

		if (result instanceof JTBCurrentStage) {
			JTBCurrentStage jtbCurrentStage = (JTBCurrentStage)result;

			if (jtbApplicationId != jtbCurrentStage.getJtbApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJTB_STAGE_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<JTBCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetByJTB_Stage, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"JTBCurrentStagePersistenceImpl.fetchBygetByJTB_Stage(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JTBCurrentStage jtbCurrentStage = list.get(0);

					result = jtbCurrentStage;

					cacheResult(jtbCurrentStage);
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
			return (JTBCurrentStage)result;
		}
	}

	/**
	 * Removes the jtb current stage where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb current stage that was removed
	 */
	@Override
	public JTBCurrentStage removeBygetByJTB_Stage(long jtbApplicationId)
		throws NoSuchJTBCurrentStageException {

		JTBCurrentStage jtbCurrentStage = findBygetByJTB_Stage(
			jtbApplicationId);

		return remove(jtbCurrentStage);
	}

	/**
	 * Returns the number of jtb current stages where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb current stages
	 */
	@Override
	public int countBygetByJTB_Stage(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByJTB_Stage;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJTB_STAGE_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETBYJTB_STAGE_JTBAPPLICATIONID_2 =
			"jtbCurrentStage.jtbApplicationId = ?";

	public JTBCurrentStagePersistenceImpl() {
		setModelClass(JTBCurrentStage.class);

		setModelImplClass(JTBCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(JTBCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the jtb current stage in the entity cache if it is enabled.
	 *
	 * @param jtbCurrentStage the jtb current stage
	 */
	@Override
	public void cacheResult(JTBCurrentStage jtbCurrentStage) {
		entityCache.putResult(
			JTBCurrentStageImpl.class, jtbCurrentStage.getPrimaryKey(),
			jtbCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetByJTB_Stage,
			new Object[] {jtbCurrentStage.getJtbApplicationId()},
			jtbCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb current stages in the entity cache if it is enabled.
	 *
	 * @param jtbCurrentStages the jtb current stages
	 */
	@Override
	public void cacheResult(List<JTBCurrentStage> jtbCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JTBCurrentStage jtbCurrentStage : jtbCurrentStages) {
			if (entityCache.getResult(
					JTBCurrentStageImpl.class,
					jtbCurrentStage.getPrimaryKey()) == null) {

				cacheResult(jtbCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all jtb current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JTBCurrentStageImpl.class);

		finderCache.clearCache(JTBCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the jtb current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JTBCurrentStage jtbCurrentStage) {
		entityCache.removeResult(JTBCurrentStageImpl.class, jtbCurrentStage);
	}

	@Override
	public void clearCache(List<JTBCurrentStage> jtbCurrentStages) {
		for (JTBCurrentStage jtbCurrentStage : jtbCurrentStages) {
			entityCache.removeResult(
				JTBCurrentStageImpl.class, jtbCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JTBCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JTBCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JTBCurrentStageModelImpl jtbCurrentStageModelImpl) {

		Object[] args = new Object[] {
			jtbCurrentStageModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetByJTB_Stage, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetByJTB_Stage, args, jtbCurrentStageModelImpl);
	}

	/**
	 * Creates a new jtb current stage with the primary key. Does not add the jtb current stage to the database.
	 *
	 * @param jTBCurrentStageId the primary key for the new jtb current stage
	 * @return the new jtb current stage
	 */
	@Override
	public JTBCurrentStage create(long jTBCurrentStageId) {
		JTBCurrentStage jtbCurrentStage = new JTBCurrentStageImpl();

		jtbCurrentStage.setNew(true);
		jtbCurrentStage.setPrimaryKey(jTBCurrentStageId);

		jtbCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbCurrentStage;
	}

	/**
	 * Removes the jtb current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage that was removed
	 * @throws NoSuchJTBCurrentStageException if a jtb current stage with the primary key could not be found
	 */
	@Override
	public JTBCurrentStage remove(long jTBCurrentStageId)
		throws NoSuchJTBCurrentStageException {

		return remove((Serializable)jTBCurrentStageId);
	}

	/**
	 * Removes the jtb current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb current stage
	 * @return the jtb current stage that was removed
	 * @throws NoSuchJTBCurrentStageException if a jtb current stage with the primary key could not be found
	 */
	@Override
	public JTBCurrentStage remove(Serializable primaryKey)
		throws NoSuchJTBCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			JTBCurrentStage jtbCurrentStage = (JTBCurrentStage)session.get(
				JTBCurrentStageImpl.class, primaryKey);

			if (jtbCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJTBCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbCurrentStage);
		}
		catch (NoSuchJTBCurrentStageException noSuchEntityException) {
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
	protected JTBCurrentStage removeImpl(JTBCurrentStage jtbCurrentStage) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbCurrentStage)) {
				jtbCurrentStage = (JTBCurrentStage)session.get(
					JTBCurrentStageImpl.class,
					jtbCurrentStage.getPrimaryKeyObj());
			}

			if (jtbCurrentStage != null) {
				session.delete(jtbCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbCurrentStage != null) {
			clearCache(jtbCurrentStage);
		}

		return jtbCurrentStage;
	}

	@Override
	public JTBCurrentStage updateImpl(JTBCurrentStage jtbCurrentStage) {
		boolean isNew = jtbCurrentStage.isNew();

		if (!(jtbCurrentStage instanceof JTBCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JTBCurrentStage implementation " +
					jtbCurrentStage.getClass());
		}

		JTBCurrentStageModelImpl jtbCurrentStageModelImpl =
			(JTBCurrentStageModelImpl)jtbCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbCurrentStage.setCreateDate(date);
			}
			else {
				jtbCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbCurrentStage.setModifiedDate(date);
			}
			else {
				jtbCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbCurrentStage);
			}
			else {
				jtbCurrentStage = (JTBCurrentStage)session.merge(
					jtbCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JTBCurrentStageImpl.class, jtbCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(jtbCurrentStageModelImpl);

		if (isNew) {
			jtbCurrentStage.setNew(false);
		}

		jtbCurrentStage.resetOriginalValues();

		return jtbCurrentStage;
	}

	/**
	 * Returns the jtb current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb current stage
	 * @return the jtb current stage
	 * @throws NoSuchJTBCurrentStageException if a jtb current stage with the primary key could not be found
	 */
	@Override
	public JTBCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJTBCurrentStageException {

		JTBCurrentStage jtbCurrentStage = fetchByPrimaryKey(primaryKey);

		if (jtbCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJTBCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbCurrentStage;
	}

	/**
	 * Returns the jtb current stage with the primary key or throws a <code>NoSuchJTBCurrentStageException</code> if it could not be found.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage
	 * @throws NoSuchJTBCurrentStageException if a jtb current stage with the primary key could not be found
	 */
	@Override
	public JTBCurrentStage findByPrimaryKey(long jTBCurrentStageId)
		throws NoSuchJTBCurrentStageException {

		return findByPrimaryKey((Serializable)jTBCurrentStageId);
	}

	/**
	 * Returns the jtb current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage, or <code>null</code> if a jtb current stage with the primary key could not be found
	 */
	@Override
	public JTBCurrentStage fetchByPrimaryKey(long jTBCurrentStageId) {
		return fetchByPrimaryKey((Serializable)jTBCurrentStageId);
	}

	/**
	 * Returns all the jtb current stages.
	 *
	 * @return the jtb current stages
	 */
	@Override
	public List<JTBCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @return the range of jtb current stages
	 */
	@Override
	public List<JTBCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb current stages
	 */
	@Override
	public List<JTBCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JTBCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb current stages
	 */
	@Override
	public List<JTBCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JTBCurrentStage> orderByComparator,
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

		List<JTBCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<JTBCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBCURRENTSTAGE;

				sql = sql.concat(JTBCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JTBCurrentStage>)QueryUtil.list(
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
	 * Removes all the jtb current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JTBCurrentStage jtbCurrentStage : findAll()) {
			remove(jtbCurrentStage);
		}
	}

	/**
	 * Returns the number of jtb current stages.
	 *
	 * @return the number of jtb current stages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JTBCURRENTSTAGE);

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
		return "jTBCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JTBCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb current stage persistence.
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

		_finderPathFetchBygetByJTB_Stage = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByJTB_Stage",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetByJTB_Stage = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetByJTB_Stage",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		JTBCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JTBCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(JTBCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBCURRENTSTAGE =
		"SELECT jtbCurrentStage FROM JTBCurrentStage jtbCurrentStage";

	private static final String _SQL_SELECT_JTBCURRENTSTAGE_WHERE =
		"SELECT jtbCurrentStage FROM JTBCurrentStage jtbCurrentStage WHERE ";

	private static final String _SQL_COUNT_JTBCURRENTSTAGE =
		"SELECT COUNT(jtbCurrentStage) FROM JTBCurrentStage jtbCurrentStage";

	private static final String _SQL_COUNT_JTBCURRENTSTAGE_WHERE =
		"SELECT COUNT(jtbCurrentStage) FROM JTBCurrentStage jtbCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jtbCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JTBCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JTBCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JTBCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}