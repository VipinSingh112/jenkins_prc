/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiInsolvencyCurrentStageException;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyCurrentStage;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyCurrentStageTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyCurrentStageImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyCurrentStageModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyCurrentStagePersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyCurrentStageUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the osi insolvency current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiInsolvencyCurrentStagePersistence.class)
public class OsiInsolvencyCurrentStagePersistenceImpl
	extends BasePersistenceImpl<OsiInsolvencyCurrentStage>
	implements OsiInsolvencyCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiInsolvencyCurrentStageUtil</code> to access the osi insolvency current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiInsolvencyCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiInsolvenyById;
	private FinderPath _finderPathCountBygetOsiInsolvenyById;

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyCurrentStageException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a matching osi insolvency current stage could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage findBygetOsiInsolvenyById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyCurrentStageException {

		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
			fetchBygetOsiInsolvenyById(osiInsolvencyId);

		if (osiInsolvencyCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolvencyCurrentStageException(sb.toString());
		}

		return osiInsolvencyCurrentStage;
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage fetchBygetOsiInsolvenyById(
		long osiInsolvencyId) {

		return fetchBygetOsiInsolvenyById(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage fetchBygetOsiInsolvenyById(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiInsolvenyById, finderArgs, this);
		}

		if (result instanceof OsiInsolvencyCurrentStage) {
			OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
				(OsiInsolvencyCurrentStage)result;

			if (osiInsolvencyId !=
					osiInsolvencyCurrentStage.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLVENCYCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENYBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiInsolvencyCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiInsolvenyById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"OsiInsolvencyCurrentStagePersistenceImpl.fetchBygetOsiInsolvenyById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
						list.get(0);

					result = osiInsolvencyCurrentStage;

					cacheResult(osiInsolvencyCurrentStage);
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
			return (OsiInsolvencyCurrentStage)result;
		}
	}

	/**
	 * Removes the osi insolvency current stage where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency current stage that was removed
	 */
	@Override
	public OsiInsolvencyCurrentStage removeBygetOsiInsolvenyById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyCurrentStageException {

		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
			findBygetOsiInsolvenyById(osiInsolvencyId);

		return remove(osiInsolvencyCurrentStage);
	}

	/**
	 * Returns the number of osi insolvency current stages where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency current stages
	 */
	@Override
	public int countBygetOsiInsolvenyById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiInsolvenyById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENYBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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
		_FINDER_COLUMN_GETOSIINSOLVENYBYID_OSIINSOLVENCYID_2 =
			"osiInsolvencyCurrentStage.osiInsolvencyId = ?";

	private FinderPath _finderPathFetchBygetOI_Stage_OII;
	private FinderPath _finderPathCountBygetOI_Stage_OII;

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyCurrentStageException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a matching osi insolvency current stage could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage findBygetOI_Stage_OII(long osiInsolvencyId)
		throws NoSuchOsiInsolvencyCurrentStageException {

		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
			fetchBygetOI_Stage_OII(osiInsolvencyId);

		if (osiInsolvencyCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolvencyCurrentStageException(sb.toString());
		}

		return osiInsolvencyCurrentStage;
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage fetchBygetOI_Stage_OII(
		long osiInsolvencyId) {

		return fetchBygetOI_Stage_OII(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage fetchBygetOI_Stage_OII(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOI_Stage_OII, finderArgs, this);
		}

		if (result instanceof OsiInsolvencyCurrentStage) {
			OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
				(OsiInsolvencyCurrentStage)result;

			if (osiInsolvencyId !=
					osiInsolvencyCurrentStage.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLVENCYCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETOI_STAGE_OII_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiInsolvencyCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOI_Stage_OII, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"OsiInsolvencyCurrentStagePersistenceImpl.fetchBygetOI_Stage_OII(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
						list.get(0);

					result = osiInsolvencyCurrentStage;

					cacheResult(osiInsolvencyCurrentStage);
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
			return (OsiInsolvencyCurrentStage)result;
		}
	}

	/**
	 * Removes the osi insolvency current stage where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency current stage that was removed
	 */
	@Override
	public OsiInsolvencyCurrentStage removeBygetOI_Stage_OII(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyCurrentStageException {

		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
			findBygetOI_Stage_OII(osiInsolvencyId);

		return remove(osiInsolvencyCurrentStage);
	}

	/**
	 * Returns the number of osi insolvency current stages where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency current stages
	 */
	@Override
	public int countBygetOI_Stage_OII(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOI_Stage_OII;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETOI_STAGE_OII_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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
		_FINDER_COLUMN_GETOI_STAGE_OII_OSIINSOLVENCYID_2 =
			"osiInsolvencyCurrentStage.osiInsolvencyId = ?";

	public OsiInsolvencyCurrentStagePersistenceImpl() {
		setModelClass(OsiInsolvencyCurrentStage.class);

		setModelImplClass(OsiInsolvencyCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(OsiInsolvencyCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the osi insolvency current stage in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyCurrentStage the osi insolvency current stage
	 */
	@Override
	public void cacheResult(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		entityCache.putResult(
			OsiInsolvencyCurrentStageImpl.class,
			osiInsolvencyCurrentStage.getPrimaryKey(),
			osiInsolvencyCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetOsiInsolvenyById,
			new Object[] {osiInsolvencyCurrentStage.getOsiInsolvencyId()},
			osiInsolvencyCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetOI_Stage_OII,
			new Object[] {osiInsolvencyCurrentStage.getOsiInsolvencyId()},
			osiInsolvencyCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi insolvency current stages in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyCurrentStages the osi insolvency current stages
	 */
	@Override
	public void cacheResult(
		List<OsiInsolvencyCurrentStage> osiInsolvencyCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiInsolvencyCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiInsolvencyCurrentStage osiInsolvencyCurrentStage :
				osiInsolvencyCurrentStages) {

			if (entityCache.getResult(
					OsiInsolvencyCurrentStageImpl.class,
					osiInsolvencyCurrentStage.getPrimaryKey()) == null) {

				cacheResult(osiInsolvencyCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all osi insolvency current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiInsolvencyCurrentStageImpl.class);

		finderCache.clearCache(OsiInsolvencyCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the osi insolvency current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		entityCache.removeResult(
			OsiInsolvencyCurrentStageImpl.class, osiInsolvencyCurrentStage);
	}

	@Override
	public void clearCache(
		List<OsiInsolvencyCurrentStage> osiInsolvencyCurrentStages) {

		for (OsiInsolvencyCurrentStage osiInsolvencyCurrentStage :
				osiInsolvencyCurrentStages) {

			entityCache.removeResult(
				OsiInsolvencyCurrentStageImpl.class, osiInsolvencyCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiInsolvencyCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiInsolvencyCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiInsolvencyCurrentStageModelImpl osiInsolvencyCurrentStageModelImpl) {

		Object[] args = new Object[] {
			osiInsolvencyCurrentStageModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiInsolvenyById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiInsolvenyById, args,
			osiInsolvencyCurrentStageModelImpl);

		args = new Object[] {
			osiInsolvencyCurrentStageModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOI_Stage_OII, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOI_Stage_OII, args,
			osiInsolvencyCurrentStageModelImpl);
	}

	/**
	 * Creates a new osi insolvency current stage with the primary key. Does not add the osi insolvency current stage to the database.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key for the new osi insolvency current stage
	 * @return the new osi insolvency current stage
	 */
	@Override
	public OsiInsolvencyCurrentStage create(long osiInsolvencyCurrentStageId) {
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
			new OsiInsolvencyCurrentStageImpl();

		osiInsolvencyCurrentStage.setNew(true);
		osiInsolvencyCurrentStage.setPrimaryKey(osiInsolvencyCurrentStageId);

		osiInsolvencyCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiInsolvencyCurrentStage;
	}

	/**
	 * Removes the osi insolvency current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage that was removed
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a osi insolvency current stage with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage remove(long osiInsolvencyCurrentStageId)
		throws NoSuchOsiInsolvencyCurrentStageException {

		return remove((Serializable)osiInsolvencyCurrentStageId);
	}

	/**
	 * Removes the osi insolvency current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage that was removed
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a osi insolvency current stage with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage remove(Serializable primaryKey)
		throws NoSuchOsiInsolvencyCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyCurrentStage osiInsolvencyCurrentStage =
				(OsiInsolvencyCurrentStage)session.get(
					OsiInsolvencyCurrentStageImpl.class, primaryKey);

			if (osiInsolvencyCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiInsolvencyCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiInsolvencyCurrentStage);
		}
		catch (NoSuchOsiInsolvencyCurrentStageException noSuchEntityException) {
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
	protected OsiInsolvencyCurrentStage removeImpl(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiInsolvencyCurrentStage)) {
				osiInsolvencyCurrentStage =
					(OsiInsolvencyCurrentStage)session.get(
						OsiInsolvencyCurrentStageImpl.class,
						osiInsolvencyCurrentStage.getPrimaryKeyObj());
			}

			if (osiInsolvencyCurrentStage != null) {
				session.delete(osiInsolvencyCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiInsolvencyCurrentStage != null) {
			clearCache(osiInsolvencyCurrentStage);
		}

		return osiInsolvencyCurrentStage;
	}

	@Override
	public OsiInsolvencyCurrentStage updateImpl(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		boolean isNew = osiInsolvencyCurrentStage.isNew();

		if (!(osiInsolvencyCurrentStage instanceof
				OsiInsolvencyCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiInsolvencyCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiInsolvencyCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiInsolvencyCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiInsolvencyCurrentStage implementation " +
					osiInsolvencyCurrentStage.getClass());
		}

		OsiInsolvencyCurrentStageModelImpl osiInsolvencyCurrentStageModelImpl =
			(OsiInsolvencyCurrentStageModelImpl)osiInsolvencyCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiInsolvencyCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiInsolvencyCurrentStage.setCreateDate(date);
			}
			else {
				osiInsolvencyCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiInsolvencyCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiInsolvencyCurrentStage.setModifiedDate(date);
			}
			else {
				osiInsolvencyCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiInsolvencyCurrentStage);
			}
			else {
				osiInsolvencyCurrentStage =
					(OsiInsolvencyCurrentStage)session.merge(
						osiInsolvencyCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiInsolvencyCurrentStageImpl.class,
			osiInsolvencyCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(osiInsolvencyCurrentStageModelImpl);

		if (isNew) {
			osiInsolvencyCurrentStage.setNew(false);
		}

		osiInsolvencyCurrentStage.resetOriginalValues();

		return osiInsolvencyCurrentStage;
	}

	/**
	 * Returns the osi insolvency current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a osi insolvency current stage with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiInsolvencyCurrentStageException {

		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage = fetchByPrimaryKey(
			primaryKey);

		if (osiInsolvencyCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiInsolvencyCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiInsolvencyCurrentStage;
	}

	/**
	 * Returns the osi insolvency current stage with the primary key or throws a <code>NoSuchOsiInsolvencyCurrentStageException</code> if it could not be found.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a osi insolvency current stage with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage findByPrimaryKey(
			long osiInsolvencyCurrentStageId)
		throws NoSuchOsiInsolvencyCurrentStageException {

		return findByPrimaryKey((Serializable)osiInsolvencyCurrentStageId);
	}

	/**
	 * Returns the osi insolvency current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage, or <code>null</code> if a osi insolvency current stage with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyCurrentStage fetchByPrimaryKey(
		long osiInsolvencyCurrentStageId) {

		return fetchByPrimaryKey((Serializable)osiInsolvencyCurrentStageId);
	}

	/**
	 * Returns all the osi insolvency current stages.
	 *
	 * @return the osi insolvency current stages
	 */
	@Override
	public List<OsiInsolvencyCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @return the range of osi insolvency current stages
	 */
	@Override
	public List<OsiInsolvencyCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency current stages
	 */
	@Override
	public List<OsiInsolvencyCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency current stages
	 */
	@Override
	public List<OsiInsolvencyCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyCurrentStage> orderByComparator,
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

		List<OsiInsolvencyCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINSOLVENCYCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINSOLVENCYCURRENTSTAGE;

				sql = sql.concat(
					OsiInsolvencyCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiInsolvencyCurrentStage>)QueryUtil.list(
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
	 * Removes all the osi insolvency current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiInsolvencyCurrentStage osiInsolvencyCurrentStage : findAll()) {
			remove(osiInsolvencyCurrentStage);
		}
	}

	/**
	 * Returns the number of osi insolvency current stages.
	 *
	 * @return the number of osi insolvency current stages
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
					_SQL_COUNT_OSIINSOLVENCYCURRENTSTAGE);

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
		return "osiInsolvencyCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINSOLVENCYCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiInsolvencyCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi insolvency current stage persistence.
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

		_finderPathFetchBygetOsiInsolvenyById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiInsolvenyById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiInsolvenyById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiInsolvenyById", new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		_finderPathFetchBygetOI_Stage_OII = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOI_Stage_OII",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOI_Stage_OII = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOI_Stage_OII",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		OsiInsolvencyCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiInsolvencyCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(OsiInsolvencyCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIINSOLVENCYCURRENTSTAGE =
		"SELECT osiInsolvencyCurrentStage FROM OsiInsolvencyCurrentStage osiInsolvencyCurrentStage";

	private static final String _SQL_SELECT_OSIINSOLVENCYCURRENTSTAGE_WHERE =
		"SELECT osiInsolvencyCurrentStage FROM OsiInsolvencyCurrentStage osiInsolvencyCurrentStage WHERE ";

	private static final String _SQL_COUNT_OSIINSOLVENCYCURRENTSTAGE =
		"SELECT COUNT(osiInsolvencyCurrentStage) FROM OsiInsolvencyCurrentStage osiInsolvencyCurrentStage";

	private static final String _SQL_COUNT_OSIINSOLVENCYCURRENTSTAGE_WHERE =
		"SELECT COUNT(osiInsolvencyCurrentStage) FROM OsiInsolvencyCurrentStage osiInsolvencyCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiInsolvencyCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiInsolvencyCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiInsolvencyCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiInsolvencyCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}