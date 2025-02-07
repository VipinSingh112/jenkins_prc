/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.farm.application.form.service.exception.NoSuchFarmerCurrentStageException;
import com.nbp.farm.application.form.service.model.FarmerCurrentStage;
import com.nbp.farm.application.form.service.model.FarmerCurrentStageTable;
import com.nbp.farm.application.form.service.model.impl.FarmerCurrentStageImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerCurrentStageModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerCurrentStagePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerCurrentStageUtil;
import com.nbp.farm.application.form.service.service.persistence.impl.constants.FARMERAPPLICATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the farmer current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {FarmerCurrentStagePersistence.class, BasePersistence.class}
)
public class FarmerCurrentStagePersistenceImpl
	extends BasePersistenceImpl<FarmerCurrentStage>
	implements FarmerCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerCurrentStageUtil</code> to access the farmer current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public FarmerCurrentStagePersistenceImpl() {
		setModelClass(FarmerCurrentStage.class);

		setModelImplClass(FarmerCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the farmer current stage in the entity cache if it is enabled.
	 *
	 * @param farmerCurrentStage the farmer current stage
	 */
	@Override
	public void cacheResult(FarmerCurrentStage farmerCurrentStage) {
		entityCache.putResult(
			FarmerCurrentStageImpl.class, farmerCurrentStage.getPrimaryKey(),
			farmerCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer current stages in the entity cache if it is enabled.
	 *
	 * @param farmerCurrentStages the farmer current stages
	 */
	@Override
	public void cacheResult(List<FarmerCurrentStage> farmerCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerCurrentStage farmerCurrentStage : farmerCurrentStages) {
			if (entityCache.getResult(
					FarmerCurrentStageImpl.class,
					farmerCurrentStage.getPrimaryKey()) == null) {

				cacheResult(farmerCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all farmer current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerCurrentStageImpl.class);

		finderCache.clearCache(FarmerCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the farmer current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerCurrentStage farmerCurrentStage) {
		entityCache.removeResult(
			FarmerCurrentStageImpl.class, farmerCurrentStage);
	}

	@Override
	public void clearCache(List<FarmerCurrentStage> farmerCurrentStages) {
		for (FarmerCurrentStage farmerCurrentStage : farmerCurrentStages) {
			entityCache.removeResult(
				FarmerCurrentStageImpl.class, farmerCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FarmerCurrentStageImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new farmer current stage with the primary key. Does not add the farmer current stage to the database.
	 *
	 * @param farmerCurrentStageId the primary key for the new farmer current stage
	 * @return the new farmer current stage
	 */
	@Override
	public FarmerCurrentStage create(long farmerCurrentStageId) {
		FarmerCurrentStage farmerCurrentStage = new FarmerCurrentStageImpl();

		farmerCurrentStage.setNew(true);
		farmerCurrentStage.setPrimaryKey(farmerCurrentStageId);

		farmerCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmerCurrentStage;
	}

	/**
	 * Removes the farmer current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage that was removed
	 * @throws NoSuchFarmerCurrentStageException if a farmer current stage with the primary key could not be found
	 */
	@Override
	public FarmerCurrentStage remove(long farmerCurrentStageId)
		throws NoSuchFarmerCurrentStageException {

		return remove((Serializable)farmerCurrentStageId);
	}

	/**
	 * Removes the farmer current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer current stage
	 * @return the farmer current stage that was removed
	 * @throws NoSuchFarmerCurrentStageException if a farmer current stage with the primary key could not be found
	 */
	@Override
	public FarmerCurrentStage remove(Serializable primaryKey)
		throws NoSuchFarmerCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			FarmerCurrentStage farmerCurrentStage =
				(FarmerCurrentStage)session.get(
					FarmerCurrentStageImpl.class, primaryKey);

			if (farmerCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerCurrentStage);
		}
		catch (NoSuchFarmerCurrentStageException noSuchEntityException) {
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
	protected FarmerCurrentStage removeImpl(
		FarmerCurrentStage farmerCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerCurrentStage)) {
				farmerCurrentStage = (FarmerCurrentStage)session.get(
					FarmerCurrentStageImpl.class,
					farmerCurrentStage.getPrimaryKeyObj());
			}

			if (farmerCurrentStage != null) {
				session.delete(farmerCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerCurrentStage != null) {
			clearCache(farmerCurrentStage);
		}

		return farmerCurrentStage;
	}

	@Override
	public FarmerCurrentStage updateImpl(
		FarmerCurrentStage farmerCurrentStage) {

		boolean isNew = farmerCurrentStage.isNew();

		if (!(farmerCurrentStage instanceof FarmerCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerCurrentStage implementation " +
					farmerCurrentStage.getClass());
		}

		FarmerCurrentStageModelImpl farmerCurrentStageModelImpl =
			(FarmerCurrentStageModelImpl)farmerCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerCurrentStage.setCreateDate(date);
			}
			else {
				farmerCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmerCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerCurrentStage.setModifiedDate(date);
			}
			else {
				farmerCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerCurrentStage);
			}
			else {
				farmerCurrentStage = (FarmerCurrentStage)session.merge(
					farmerCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerCurrentStageImpl.class, farmerCurrentStage, false, true);

		if (isNew) {
			farmerCurrentStage.setNew(false);
		}

		farmerCurrentStage.resetOriginalValues();

		return farmerCurrentStage;
	}

	/**
	 * Returns the farmer current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer current stage
	 * @return the farmer current stage
	 * @throws NoSuchFarmerCurrentStageException if a farmer current stage with the primary key could not be found
	 */
	@Override
	public FarmerCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerCurrentStageException {

		FarmerCurrentStage farmerCurrentStage = fetchByPrimaryKey(primaryKey);

		if (farmerCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerCurrentStage;
	}

	/**
	 * Returns the farmer current stage with the primary key or throws a <code>NoSuchFarmerCurrentStageException</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage
	 * @throws NoSuchFarmerCurrentStageException if a farmer current stage with the primary key could not be found
	 */
	@Override
	public FarmerCurrentStage findByPrimaryKey(long farmerCurrentStageId)
		throws NoSuchFarmerCurrentStageException {

		return findByPrimaryKey((Serializable)farmerCurrentStageId);
	}

	/**
	 * Returns the farmer current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage, or <code>null</code> if a farmer current stage with the primary key could not be found
	 */
	@Override
	public FarmerCurrentStage fetchByPrimaryKey(long farmerCurrentStageId) {
		return fetchByPrimaryKey((Serializable)farmerCurrentStageId);
	}

	/**
	 * Returns all the farmer current stages.
	 *
	 * @return the farmer current stages
	 */
	@Override
	public List<FarmerCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @return the range of farmer current stages
	 */
	@Override
	public List<FarmerCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer current stages
	 */
	@Override
	public List<FarmerCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FarmerCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer current stages
	 */
	@Override
	public List<FarmerCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FarmerCurrentStage> orderByComparator,
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

		List<FarmerCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<FarmerCurrentStage>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERCURRENTSTAGE;

				sql = sql.concat(FarmerCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerCurrentStage>)QueryUtil.list(
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
	 * Removes all the farmer current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerCurrentStage farmerCurrentStage : findAll()) {
			remove(farmerCurrentStage);
		}
	}

	/**
	 * Returns the number of farmer current stages.
	 *
	 * @return the number of farmer current stages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FARMERCURRENTSTAGE);

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
		return "farmerCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer current stage persistence.
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

		_setFarmerCurrentStageUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerCurrentStageUtilPersistence(null);

		entityCache.removeCache(FarmerCurrentStageImpl.class.getName());
	}

	private void _setFarmerCurrentStageUtilPersistence(
		FarmerCurrentStagePersistence farmerCurrentStagePersistence) {

		try {
			Field field = FarmerCurrentStageUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmerCurrentStagePersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FARMERCURRENTSTAGE =
		"SELECT farmerCurrentStage FROM FarmerCurrentStage farmerCurrentStage";

	private static final String _SQL_COUNT_FARMERCURRENTSTAGE =
		"SELECT COUNT(farmerCurrentStage) FROM FarmerCurrentStage farmerCurrentStage";

	private static final String _ORDER_BY_ENTITY_ALIAS = "farmerCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerCurrentStage exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerCurrentStageModelArgumentsResolver
		_farmerCurrentStageModelArgumentsResolver;

}