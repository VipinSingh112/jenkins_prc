/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence.impl;

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

import com.nbp.miic.application.form.services.exception.NoSuchMiicApplicationCurrentStageException;
import com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage;
import com.nbp.miic.application.form.services.model.MiicApplicationCurrentStageTable;
import com.nbp.miic.application.form.services.model.impl.MiicApplicationCurrentStageImpl;
import com.nbp.miic.application.form.services.model.impl.MiicApplicationCurrentStageModelImpl;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicationCurrentStagePersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicationCurrentStageUtil;
import com.nbp.miic.application.form.services.service.persistence.impl.constants.MIIC_SERVICESPersistenceConstants;

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
 * The persistence implementation for the miic application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicApplicationCurrentStagePersistence.class)
public class MiicApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<MiicApplicationCurrentStage>
	implements MiicApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicApplicationCurrentStageUtil</code> to access the miic application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicApplicationCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMIIC_Stage_MIIC_AI;
	private FinderPath _finderPathCountBygetMIIC_Stage_MIIC_AI;

	/**
	 * Returns the miic application current stage where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application current stage
	 * @throws NoSuchMiicApplicationCurrentStageException if a matching miic application current stage could not be found
	 */
	@Override
	public MiicApplicationCurrentStage findBygetMIIC_Stage_MIIC_AI(
			long miicApplicationId)
		throws NoSuchMiicApplicationCurrentStageException {

		MiicApplicationCurrentStage miicApplicationCurrentStage =
			fetchBygetMIIC_Stage_MIIC_AI(miicApplicationId);

		if (miicApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miicApplicationId=");
			sb.append(miicApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicApplicationCurrentStageException(sb.toString());
		}

		return miicApplicationCurrentStage;
	}

	/**
	 * Returns the miic application current stage where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application current stage, or <code>null</code> if a matching miic application current stage could not be found
	 */
	@Override
	public MiicApplicationCurrentStage fetchBygetMIIC_Stage_MIIC_AI(
		long miicApplicationId) {

		return fetchBygetMIIC_Stage_MIIC_AI(miicApplicationId, true);
	}

	/**
	 * Returns the miic application current stage where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application current stage, or <code>null</code> if a matching miic application current stage could not be found
	 */
	@Override
	public MiicApplicationCurrentStage fetchBygetMIIC_Stage_MIIC_AI(
		long miicApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {miicApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMIIC_Stage_MIIC_AI, finderArgs, this);
		}

		if (result instanceof MiicApplicationCurrentStage) {
			MiicApplicationCurrentStage miicApplicationCurrentStage =
				(MiicApplicationCurrentStage)result;

			if (miicApplicationId !=
					miicApplicationCurrentStage.getMiicApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETMIIC_STAGE_MIIC_AI_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

				List<MiicApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIIC_Stage_MIIC_AI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {miicApplicationId};
							}

							_log.warn(
								"MiicApplicationCurrentStagePersistenceImpl.fetchBygetMIIC_Stage_MIIC_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplicationCurrentStage miicApplicationCurrentStage =
						list.get(0);

					result = miicApplicationCurrentStage;

					cacheResult(miicApplicationCurrentStage);
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
			return (MiicApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the miic application current stage where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic application current stage that was removed
	 */
	@Override
	public MiicApplicationCurrentStage removeBygetMIIC_Stage_MIIC_AI(
			long miicApplicationId)
		throws NoSuchMiicApplicationCurrentStageException {

		MiicApplicationCurrentStage miicApplicationCurrentStage =
			findBygetMIIC_Stage_MIIC_AI(miicApplicationId);

		return remove(miicApplicationCurrentStage);
	}

	/**
	 * Returns the number of miic application current stages where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic application current stages
	 */
	@Override
	public int countBygetMIIC_Stage_MIIC_AI(long miicApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMIIC_Stage_MIIC_AI;

		Object[] finderArgs = new Object[] {miicApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETMIIC_STAGE_MIIC_AI_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

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
		_FINDER_COLUMN_GETMIIC_STAGE_MIIC_AI_MIICAPPLICATIONID_2 =
			"miicApplicationCurrentStage.miicApplicationId = ?";

	public MiicApplicationCurrentStagePersistenceImpl() {
		setModelClass(MiicApplicationCurrentStage.class);

		setModelImplClass(MiicApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(MiicApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the miic application current stage in the entity cache if it is enabled.
	 *
	 * @param miicApplicationCurrentStage the miic application current stage
	 */
	@Override
	public void cacheResult(
		MiicApplicationCurrentStage miicApplicationCurrentStage) {

		entityCache.putResult(
			MiicApplicationCurrentStageImpl.class,
			miicApplicationCurrentStage.getPrimaryKey(),
			miicApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetMIIC_Stage_MIIC_AI,
			new Object[] {miicApplicationCurrentStage.getMiicApplicationId()},
			miicApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic application current stages in the entity cache if it is enabled.
	 *
	 * @param miicApplicationCurrentStages the miic application current stages
	 */
	@Override
	public void cacheResult(
		List<MiicApplicationCurrentStage> miicApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicApplicationCurrentStage miicApplicationCurrentStage :
				miicApplicationCurrentStages) {

			if (entityCache.getResult(
					MiicApplicationCurrentStageImpl.class,
					miicApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(miicApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all miic application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicApplicationCurrentStageImpl.class);

		finderCache.clearCache(MiicApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the miic application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MiicApplicationCurrentStage miicApplicationCurrentStage) {

		entityCache.removeResult(
			MiicApplicationCurrentStageImpl.class, miicApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<MiicApplicationCurrentStage> miicApplicationCurrentStages) {

		for (MiicApplicationCurrentStage miicApplicationCurrentStage :
				miicApplicationCurrentStages) {

			entityCache.removeResult(
				MiicApplicationCurrentStageImpl.class,
				miicApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiicApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiicApplicationCurrentStageModelImpl
			miicApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			miicApplicationCurrentStageModelImpl.getMiicApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMIIC_Stage_MIIC_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIIC_Stage_MIIC_AI, args,
			miicApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new miic application current stage with the primary key. Does not add the miic application current stage to the database.
	 *
	 * @param miicApplicationCurrentStageId the primary key for the new miic application current stage
	 * @return the new miic application current stage
	 */
	@Override
	public MiicApplicationCurrentStage create(
		long miicApplicationCurrentStageId) {

		MiicApplicationCurrentStage miicApplicationCurrentStage =
			new MiicApplicationCurrentStageImpl();

		miicApplicationCurrentStage.setNew(true);
		miicApplicationCurrentStage.setPrimaryKey(
			miicApplicationCurrentStageId);

		miicApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miicApplicationCurrentStage;
	}

	/**
	 * Removes the miic application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicationCurrentStageId the primary key of the miic application current stage
	 * @return the miic application current stage that was removed
	 * @throws NoSuchMiicApplicationCurrentStageException if a miic application current stage with the primary key could not be found
	 */
	@Override
	public MiicApplicationCurrentStage remove(
			long miicApplicationCurrentStageId)
		throws NoSuchMiicApplicationCurrentStageException {

		return remove((Serializable)miicApplicationCurrentStageId);
	}

	/**
	 * Removes the miic application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic application current stage
	 * @return the miic application current stage that was removed
	 * @throws NoSuchMiicApplicationCurrentStageException if a miic application current stage with the primary key could not be found
	 */
	@Override
	public MiicApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchMiicApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			MiicApplicationCurrentStage miicApplicationCurrentStage =
				(MiicApplicationCurrentStage)session.get(
					MiicApplicationCurrentStageImpl.class, primaryKey);

			if (miicApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicApplicationCurrentStage);
		}
		catch (NoSuchMiicApplicationCurrentStageException
					noSuchEntityException) {

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
	protected MiicApplicationCurrentStage removeImpl(
		MiicApplicationCurrentStage miicApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicApplicationCurrentStage)) {
				miicApplicationCurrentStage =
					(MiicApplicationCurrentStage)session.get(
						MiicApplicationCurrentStageImpl.class,
						miicApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (miicApplicationCurrentStage != null) {
				session.delete(miicApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicApplicationCurrentStage != null) {
			clearCache(miicApplicationCurrentStage);
		}

		return miicApplicationCurrentStage;
	}

	@Override
	public MiicApplicationCurrentStage updateImpl(
		MiicApplicationCurrentStage miicApplicationCurrentStage) {

		boolean isNew = miicApplicationCurrentStage.isNew();

		if (!(miicApplicationCurrentStage instanceof
				MiicApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					miicApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					miicApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicApplicationCurrentStage implementation " +
					miicApplicationCurrentStage.getClass());
		}

		MiicApplicationCurrentStageModelImpl
			miicApplicationCurrentStageModelImpl =
				(MiicApplicationCurrentStageModelImpl)
					miicApplicationCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicApplicationCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicApplicationCurrentStage.setCreateDate(date);
			}
			else {
				miicApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				miicApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicApplicationCurrentStage);
			}
			else {
				miicApplicationCurrentStage =
					(MiicApplicationCurrentStage)session.merge(
						miicApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicApplicationCurrentStageImpl.class,
			miicApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(miicApplicationCurrentStageModelImpl);

		if (isNew) {
			miicApplicationCurrentStage.setNew(false);
		}

		miicApplicationCurrentStage.resetOriginalValues();

		return miicApplicationCurrentStage;
	}

	/**
	 * Returns the miic application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic application current stage
	 * @return the miic application current stage
	 * @throws NoSuchMiicApplicationCurrentStageException if a miic application current stage with the primary key could not be found
	 */
	@Override
	public MiicApplicationCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicApplicationCurrentStageException {

		MiicApplicationCurrentStage miicApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (miicApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicApplicationCurrentStage;
	}

	/**
	 * Returns the miic application current stage with the primary key or throws a <code>NoSuchMiicApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param miicApplicationCurrentStageId the primary key of the miic application current stage
	 * @return the miic application current stage
	 * @throws NoSuchMiicApplicationCurrentStageException if a miic application current stage with the primary key could not be found
	 */
	@Override
	public MiicApplicationCurrentStage findByPrimaryKey(
			long miicApplicationCurrentStageId)
		throws NoSuchMiicApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)miicApplicationCurrentStageId);
	}

	/**
	 * Returns the miic application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicationCurrentStageId the primary key of the miic application current stage
	 * @return the miic application current stage, or <code>null</code> if a miic application current stage with the primary key could not be found
	 */
	@Override
	public MiicApplicationCurrentStage fetchByPrimaryKey(
		long miicApplicationCurrentStageId) {

		return fetchByPrimaryKey((Serializable)miicApplicationCurrentStageId);
	}

	/**
	 * Returns all the miic application current stages.
	 *
	 * @return the miic application current stages
	 */
	@Override
	public List<MiicApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application current stages
	 * @param end the upper bound of the range of miic application current stages (not inclusive)
	 * @return the range of miic application current stages
	 */
	@Override
	public List<MiicApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application current stages
	 * @param end the upper bound of the range of miic application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic application current stages
	 */
	@Override
	public List<MiicApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MiicApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application current stages
	 * @param end the upper bound of the range of miic application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic application current stages
	 */
	@Override
	public List<MiicApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MiicApplicationCurrentStage> orderByComparator,
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

		List<MiicApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<MiicApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					MiicApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the miic application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicApplicationCurrentStage miicApplicationCurrentStage :
				findAll()) {

			remove(miicApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of miic application current stages.
	 *
	 * @return the number of miic application current stages
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
					_SQL_COUNT_MIICAPPLICATIONCURRENTSTAGE);

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
		return "miicApplicationCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic application current stage persistence.
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

		_finderPathFetchBygetMIIC_Stage_MIIC_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIIC_Stage_MIIC_AI",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, true);

		_finderPathCountBygetMIIC_Stage_MIIC_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMIIC_Stage_MIIC_AI", new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, false);

		MiicApplicationCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicApplicationCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			MiicApplicationCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICAPPLICATIONCURRENTSTAGE =
		"SELECT miicApplicationCurrentStage FROM MiicApplicationCurrentStage miicApplicationCurrentStage";

	private static final String _SQL_SELECT_MIICAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT miicApplicationCurrentStage FROM MiicApplicationCurrentStage miicApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_MIICAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(miicApplicationCurrentStage) FROM MiicApplicationCurrentStage miicApplicationCurrentStage";

	private static final String _SQL_COUNT_MIICAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT COUNT(miicApplicationCurrentStage) FROM MiicApplicationCurrentStage miicApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miicApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicApplicationCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}