/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchJanaacAppliCurrentStageException;
import com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage;
import com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStageTable;
import com.nbp.janaac.application.form.service.model.impl.JanaacAppliCurrentStageImpl;
import com.nbp.janaac.application.form.service.model.impl.JanaacAppliCurrentStageModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.JanaacAppliCurrentStagePersistence;
import com.nbp.janaac.application.form.service.service.persistence.JanaacAppliCurrentStageUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the janaac appli current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JanaacAppliCurrentStagePersistence.class)
public class JanaacAppliCurrentStagePersistenceImpl
	extends BasePersistenceImpl<JanaacAppliCurrentStage>
	implements JanaacAppliCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JanaacAppliCurrentStageUtil</code> to access the janaac appli current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JanaacAppliCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJanaac_Stage_JAI;
	private FinderPath _finderPathCountBygetJanaac_Stage_JAI;

	/**
	 * Returns the janaac appli current stage where janaacApplicationId = &#63; or throws a <code>NoSuchJanaacAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac appli current stage
	 * @throws NoSuchJanaacAppliCurrentStageException if a matching janaac appli current stage could not be found
	 */
	@Override
	public JanaacAppliCurrentStage findBygetJanaac_Stage_JAI(
			long janaacApplicationId)
		throws NoSuchJanaacAppliCurrentStageException {

		JanaacAppliCurrentStage janaacAppliCurrentStage =
			fetchBygetJanaac_Stage_JAI(janaacApplicationId);

		if (janaacAppliCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("janaacApplicationId=");
			sb.append(janaacApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacAppliCurrentStageException(sb.toString());
		}

		return janaacAppliCurrentStage;
	}

	/**
	 * Returns the janaac appli current stage where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac appli current stage, or <code>null</code> if a matching janaac appli current stage could not be found
	 */
	@Override
	public JanaacAppliCurrentStage fetchBygetJanaac_Stage_JAI(
		long janaacApplicationId) {

		return fetchBygetJanaac_Stage_JAI(janaacApplicationId, true);
	}

	/**
	 * Returns the janaac appli current stage where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac appli current stage, or <code>null</code> if a matching janaac appli current stage could not be found
	 */
	@Override
	public JanaacAppliCurrentStage fetchBygetJanaac_Stage_JAI(
		long janaacApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {janaacApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJanaac_Stage_JAI, finderArgs, this);
		}

		if (result instanceof JanaacAppliCurrentStage) {
			JanaacAppliCurrentStage janaacAppliCurrentStage =
				(JanaacAppliCurrentStage)result;

			if (janaacApplicationId !=
					janaacAppliCurrentStage.getJanaacApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACAPPLICURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_STAGE_JAI_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				List<JanaacAppliCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaac_Stage_JAI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {janaacApplicationId};
							}

							_log.warn(
								"JanaacAppliCurrentStagePersistenceImpl.fetchBygetJanaac_Stage_JAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacAppliCurrentStage janaacAppliCurrentStage = list.get(
						0);

					result = janaacAppliCurrentStage;

					cacheResult(janaacAppliCurrentStage);
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
			return (JanaacAppliCurrentStage)result;
		}
	}

	/**
	 * Removes the janaac appli current stage where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac appli current stage that was removed
	 */
	@Override
	public JanaacAppliCurrentStage removeBygetJanaac_Stage_JAI(
			long janaacApplicationId)
		throws NoSuchJanaacAppliCurrentStageException {

		JanaacAppliCurrentStage janaacAppliCurrentStage =
			findBygetJanaac_Stage_JAI(janaacApplicationId);

		return remove(janaacAppliCurrentStage);
	}

	/**
	 * Returns the number of janaac appli current stages where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac appli current stages
	 */
	@Override
	public int countBygetJanaac_Stage_JAI(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaac_Stage_JAI;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_STAGE_JAI_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAAC_STAGE_JAI_JANAACAPPLICATIONID_2 =
			"janaacAppliCurrentStage.janaacApplicationId = ?";

	public JanaacAppliCurrentStagePersistenceImpl() {
		setModelClass(JanaacAppliCurrentStage.class);

		setModelImplClass(JanaacAppliCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(JanaacAppliCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the janaac appli current stage in the entity cache if it is enabled.
	 *
	 * @param janaacAppliCurrentStage the janaac appli current stage
	 */
	@Override
	public void cacheResult(JanaacAppliCurrentStage janaacAppliCurrentStage) {
		entityCache.putResult(
			JanaacAppliCurrentStageImpl.class,
			janaacAppliCurrentStage.getPrimaryKey(), janaacAppliCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetJanaac_Stage_JAI,
			new Object[] {janaacAppliCurrentStage.getJanaacApplicationId()},
			janaacAppliCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the janaac appli current stages in the entity cache if it is enabled.
	 *
	 * @param janaacAppliCurrentStages the janaac appli current stages
	 */
	@Override
	public void cacheResult(
		List<JanaacAppliCurrentStage> janaacAppliCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (janaacAppliCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JanaacAppliCurrentStage janaacAppliCurrentStage :
				janaacAppliCurrentStages) {

			if (entityCache.getResult(
					JanaacAppliCurrentStageImpl.class,
					janaacAppliCurrentStage.getPrimaryKey()) == null) {

				cacheResult(janaacAppliCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all janaac appli current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JanaacAppliCurrentStageImpl.class);

		finderCache.clearCache(JanaacAppliCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the janaac appli current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JanaacAppliCurrentStage janaacAppliCurrentStage) {
		entityCache.removeResult(
			JanaacAppliCurrentStageImpl.class, janaacAppliCurrentStage);
	}

	@Override
	public void clearCache(
		List<JanaacAppliCurrentStage> janaacAppliCurrentStages) {

		for (JanaacAppliCurrentStage janaacAppliCurrentStage :
				janaacAppliCurrentStages) {

			entityCache.removeResult(
				JanaacAppliCurrentStageImpl.class, janaacAppliCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JanaacAppliCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JanaacAppliCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JanaacAppliCurrentStageModelImpl janaacAppliCurrentStageModelImpl) {

		Object[] args = new Object[] {
			janaacAppliCurrentStageModelImpl.getJanaacApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJanaac_Stage_JAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaac_Stage_JAI, args,
			janaacAppliCurrentStageModelImpl);
	}

	/**
	 * Creates a new janaac appli current stage with the primary key. Does not add the janaac appli current stage to the database.
	 *
	 * @param janaacAppliCurrentStageId the primary key for the new janaac appli current stage
	 * @return the new janaac appli current stage
	 */
	@Override
	public JanaacAppliCurrentStage create(long janaacAppliCurrentStageId) {
		JanaacAppliCurrentStage janaacAppliCurrentStage =
			new JanaacAppliCurrentStageImpl();

		janaacAppliCurrentStage.setNew(true);
		janaacAppliCurrentStage.setPrimaryKey(janaacAppliCurrentStageId);

		janaacAppliCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return janaacAppliCurrentStage;
	}

	/**
	 * Removes the janaac appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage that was removed
	 * @throws NoSuchJanaacAppliCurrentStageException if a janaac appli current stage with the primary key could not be found
	 */
	@Override
	public JanaacAppliCurrentStage remove(long janaacAppliCurrentStageId)
		throws NoSuchJanaacAppliCurrentStageException {

		return remove((Serializable)janaacAppliCurrentStageId);
	}

	/**
	 * Removes the janaac appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the janaac appli current stage
	 * @return the janaac appli current stage that was removed
	 * @throws NoSuchJanaacAppliCurrentStageException if a janaac appli current stage with the primary key could not be found
	 */
	@Override
	public JanaacAppliCurrentStage remove(Serializable primaryKey)
		throws NoSuchJanaacAppliCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			JanaacAppliCurrentStage janaacAppliCurrentStage =
				(JanaacAppliCurrentStage)session.get(
					JanaacAppliCurrentStageImpl.class, primaryKey);

			if (janaacAppliCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJanaacAppliCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(janaacAppliCurrentStage);
		}
		catch (NoSuchJanaacAppliCurrentStageException noSuchEntityException) {
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
	protected JanaacAppliCurrentStage removeImpl(
		JanaacAppliCurrentStage janaacAppliCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(janaacAppliCurrentStage)) {
				janaacAppliCurrentStage = (JanaacAppliCurrentStage)session.get(
					JanaacAppliCurrentStageImpl.class,
					janaacAppliCurrentStage.getPrimaryKeyObj());
			}

			if (janaacAppliCurrentStage != null) {
				session.delete(janaacAppliCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (janaacAppliCurrentStage != null) {
			clearCache(janaacAppliCurrentStage);
		}

		return janaacAppliCurrentStage;
	}

	@Override
	public JanaacAppliCurrentStage updateImpl(
		JanaacAppliCurrentStage janaacAppliCurrentStage) {

		boolean isNew = janaacAppliCurrentStage.isNew();

		if (!(janaacAppliCurrentStage instanceof
				JanaacAppliCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(janaacAppliCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					janaacAppliCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in janaacAppliCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JanaacAppliCurrentStage implementation " +
					janaacAppliCurrentStage.getClass());
		}

		JanaacAppliCurrentStageModelImpl janaacAppliCurrentStageModelImpl =
			(JanaacAppliCurrentStageModelImpl)janaacAppliCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (janaacAppliCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				janaacAppliCurrentStage.setCreateDate(date);
			}
			else {
				janaacAppliCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!janaacAppliCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				janaacAppliCurrentStage.setModifiedDate(date);
			}
			else {
				janaacAppliCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(janaacAppliCurrentStage);
			}
			else {
				janaacAppliCurrentStage =
					(JanaacAppliCurrentStage)session.merge(
						janaacAppliCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JanaacAppliCurrentStageImpl.class, janaacAppliCurrentStageModelImpl,
			false, true);

		cacheUniqueFindersCache(janaacAppliCurrentStageModelImpl);

		if (isNew) {
			janaacAppliCurrentStage.setNew(false);
		}

		janaacAppliCurrentStage.resetOriginalValues();

		return janaacAppliCurrentStage;
	}

	/**
	 * Returns the janaac appli current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the janaac appli current stage
	 * @return the janaac appli current stage
	 * @throws NoSuchJanaacAppliCurrentStageException if a janaac appli current stage with the primary key could not be found
	 */
	@Override
	public JanaacAppliCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJanaacAppliCurrentStageException {

		JanaacAppliCurrentStage janaacAppliCurrentStage = fetchByPrimaryKey(
			primaryKey);

		if (janaacAppliCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJanaacAppliCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return janaacAppliCurrentStage;
	}

	/**
	 * Returns the janaac appli current stage with the primary key or throws a <code>NoSuchJanaacAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage
	 * @throws NoSuchJanaacAppliCurrentStageException if a janaac appli current stage with the primary key could not be found
	 */
	@Override
	public JanaacAppliCurrentStage findByPrimaryKey(
			long janaacAppliCurrentStageId)
		throws NoSuchJanaacAppliCurrentStageException {

		return findByPrimaryKey((Serializable)janaacAppliCurrentStageId);
	}

	/**
	 * Returns the janaac appli current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage, or <code>null</code> if a janaac appli current stage with the primary key could not be found
	 */
	@Override
	public JanaacAppliCurrentStage fetchByPrimaryKey(
		long janaacAppliCurrentStageId) {

		return fetchByPrimaryKey((Serializable)janaacAppliCurrentStageId);
	}

	/**
	 * Returns all the janaac appli current stages.
	 *
	 * @return the janaac appli current stages
	 */
	@Override
	public List<JanaacAppliCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac appli current stages
	 * @param end the upper bound of the range of janaac appli current stages (not inclusive)
	 * @return the range of janaac appli current stages
	 */
	@Override
	public List<JanaacAppliCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac appli current stages
	 * @param end the upper bound of the range of janaac appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac appli current stages
	 */
	@Override
	public List<JanaacAppliCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JanaacAppliCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac appli current stages
	 * @param end the upper bound of the range of janaac appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac appli current stages
	 */
	@Override
	public List<JanaacAppliCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JanaacAppliCurrentStage> orderByComparator,
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

		List<JanaacAppliCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<JanaacAppliCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JANAACAPPLICURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JANAACAPPLICURRENTSTAGE;

				sql = sql.concat(
					JanaacAppliCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JanaacAppliCurrentStage>)QueryUtil.list(
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
	 * Removes all the janaac appli current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JanaacAppliCurrentStage janaacAppliCurrentStage : findAll()) {
			remove(janaacAppliCurrentStage);
		}
	}

	/**
	 * Returns the number of janaac appli current stages.
	 *
	 * @return the number of janaac appli current stages
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
					_SQL_COUNT_JANAACAPPLICURRENTSTAGE);

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
		return "janaacAppliCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JANAACAPPLICURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JanaacAppliCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the janaac appli current stage persistence.
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

		_finderPathFetchBygetJanaac_Stage_JAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaac_Stage_JAI",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaac_Stage_JAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_Stage_JAI", new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		JanaacAppliCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JanaacAppliCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(JanaacAppliCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JANAACAPPLICURRENTSTAGE =
		"SELECT janaacAppliCurrentStage FROM JanaacAppliCurrentStage janaacAppliCurrentStage";

	private static final String _SQL_SELECT_JANAACAPPLICURRENTSTAGE_WHERE =
		"SELECT janaacAppliCurrentStage FROM JanaacAppliCurrentStage janaacAppliCurrentStage WHERE ";

	private static final String _SQL_COUNT_JANAACAPPLICURRENTSTAGE =
		"SELECT COUNT(janaacAppliCurrentStage) FROM JanaacAppliCurrentStage janaacAppliCurrentStage";

	private static final String _SQL_COUNT_JANAACAPPLICURRENTSTAGE_WHERE =
		"SELECT COUNT(janaacAppliCurrentStage) FROM JanaacAppliCurrentStage janaacAppliCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"janaacAppliCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JanaacAppliCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JanaacAppliCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JanaacAppliCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}